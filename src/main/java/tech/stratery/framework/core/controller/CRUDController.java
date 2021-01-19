package tech.stratery.framework.core.controller;

import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.framework.core.domain.DomainObject;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;

import java.io.Serializable;
import java.util.List;

public abstract class CRUDController<
        Domain extends DomainObject<ID>,
        Entity extends DomainJPAEntity<Domain, ID>,
        DTObject extends DataTransferObject<Domain, ID>,
        ID extends Serializable> {

    protected final DomainService<Domain, Entity, ID> service;

    protected final DomainModelMappingWrapper<Domain, DTObject> mapping;

    protected CRUDController(DomainService<Domain, Entity, ID> service, DomainModelMappingWrapper<Domain, DTObject> mapping) {
        this.service = service;
        this.mapping = mapping;
    }

    public DTObject create(DTObject dto) {
        Domain domain = mapping.back(dto);
        domain = service.create(domain);
        DTObject result = mapping.forward(domain);
        return result;
    }

    public DTObject get(ID id) {
        Domain object = service.get(id);
        DTObject result = mapping.forward(object);
        return result;
    }

    public Iterable<DTObject> get() {
        List<Domain> objects = service.get();
        Iterable<DTObject> dtos = mapping.forward(objects);
        return dtos;
    }

    public DTObject update(DTObject dto) {
        Domain domain = mapping.back(dto);
        domain = service.update(domain);
        DTObject result = mapping.forward(domain);
        return result;
    }

    public void delete(ID id) {
        service.delete(id);
    }
}
