package tech.stratery.framework.core.controller;

import lombok.Data;
import tech.stratery.framework.core.domain.DomainObject;

import java.io.Serializable;

@Data
public abstract class DataTransferObject<Domain extends DomainObject<ID>, ID extends Serializable> implements Serializable {
    private ID id;

    public DataTransferObject() {
    }

    public String toString() {
        return "DataTransferObject(id=" + this.getId() + ")";
    }
}
