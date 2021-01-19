package tech.stratery.framework.core.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface DomainRepository<
            Entity extends DomainJPAEntity,
            ID extends Serializable>
        extends JpaRepository<Entity, ID>, JpaSpecificationExecutor<Entity> {
}
