package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.TopicFlow;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "BLOGS")
@AllArgsConstructor
@NoArgsConstructor
public class TopicFlowEntity extends DomainJPAEntity<TopicFlow, UUID> {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "administrator")
    private UUID administrator;

    @OneToMany(targetEntity = ArticleEntity.class, fetch = FetchType.EAGER, mappedBy = "topic")
    private Set<ArticleEntity> articles;

    @OneToMany(targetEntity = SubscribeEntity.class, fetch = FetchType.EAGER, mappedBy = "topic")
    private Set<SubscribeEntity> subscribes;

}
