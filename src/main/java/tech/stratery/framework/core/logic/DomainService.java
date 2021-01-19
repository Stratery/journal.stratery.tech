package tech.stratery.framework.core.logic;

import tech.stratery.framework.core.data.DataService;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.framework.core.domain.DomainObject;

import java.io.Serializable;
import java.util.List;

public abstract class DomainService<
        Domain extends DomainObject<ID>,
        Entity extends DomainJPAEntity<Domain, ID>,
        ID extends Serializable>
        implements DataService<Domain, ID> {

    protected final DomainDataService<Domain, Entity, ID> dataService;

    public DomainService(DomainDataService<Domain, Entity, ID> dataService) {
        this.dataService = dataService;
    }

    public Domain create(Domain object) {
        return dataService.create(object);
    }

    public Domain get(ID id) {
        return dataService.get(id);
    }

    public List<Domain> get() {
        return dataService.get();
    }

    public Domain update(Domain object) {
        return dataService.update(object);
    }

    public void delete(ID id) {
        dataService.delete(id);
    }
}
