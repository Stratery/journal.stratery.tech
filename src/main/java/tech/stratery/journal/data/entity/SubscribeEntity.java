package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Subscribe;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "SUBSCRIBES")
@AllArgsConstructor
@NoArgsConstructor
public class SubscribeEntity extends DomainJPAEntity<Subscribe, UUID> {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "blog")
    private UUID blog;

    @Column(name = "user")
    private UUID user;

    @ManyToOne(targetEntity = TopicFlowEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "blog_id", referencedColumnName = "id")
    private TopicFlowEntity topic;

}
