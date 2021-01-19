package tech.stratery.framework.core.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DomainObject<ID extends Serializable> implements Serializable {

    private ID id;

    public String toString() {
        return "ToolKitDomainObject(id=" + this.getId() + ")";
    }
}