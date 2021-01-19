package tech.stratery.framework.core.data.jpa;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import tech.stratery.framework.core.domain.DomainObject;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class DomainJPAEntity<DObject extends DomainObject<ID>, ID extends Serializable> {

    @Id()
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, unique=true, nullable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.IDENTITY)
    private ID id;

    public DomainJPAEntity() {
    }

    public String toString() {
        return "ToolKitEntity(id=" + this.getId() + ")";
    }
}
