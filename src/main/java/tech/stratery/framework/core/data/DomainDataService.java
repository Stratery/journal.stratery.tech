package tech.stratery.framework.core.data;



import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.framework.core.data.jpa.DomainRepository;
import tech.stratery.framework.core.domain.DomainObject;

import java.io.Serializable;
import java.util.List;

public abstract class DomainDataService <
        Domain extends DomainObject<ID>,
        Entity extends DomainJPAEntity<Domain, ID>,
        ID extends Serializable>
        implements DataService<Domain,ID> {

    private final DomainRepository<Entity, ID> repository;
    private final DomainModelMappingWrapper<Domain, Entity> mapping;

    protected DomainDataService(DomainRepository<Entity, ID> repository, DomainModelMappingWrapper<Domain, Entity> mapping) {
        this.repository = repository;
        this.mapping = mapping;
    }

    public DomainModelMappingWrapper<Domain, Entity> getMapping() {
        return mapping;
    }

    protected DomainRepository<Entity, ID> getRepository() {
        return this.repository;
    }

    @Override
    public Domain create(Domain domain) {
        Entity entity = mapping.forward(domain);
        Entity saved = repository.saveAndFlush(entity);
        return mapping.back(saved);
    }

    @Override
    public Domain get(ID id) {
        Entity entity = repository.getOne(id);
        return mapping.back(entity);
    }

    @Override
    public List<Domain> get() {
        List<Entity> list = repository.findAll();
        return mapping.back(list);
    }

    @Override
    public Domain update(Domain domain) {
        Entity entity = mapping.forward(domain);
        Entity saved = repository.saveAndFlush(entity);
        return mapping.back(saved);
    }

    @Override
    public void delete(ID id) {
        repository.deleteById(id);
    }
}