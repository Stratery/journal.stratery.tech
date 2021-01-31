package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Subscribe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "SUBSCRIBES")
@AllArgsConstructor
@NoArgsConstructor
public class SubscribeEntity extends DomainJPAEntity<Subscribe, UUID> {

    @Column(name = "blog")
    private String name;
}
