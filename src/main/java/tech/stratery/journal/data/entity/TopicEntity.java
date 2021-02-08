package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Topic;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "TOPIC")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "articles", callSuper = true)
public class TopicEntity extends DomainJPAEntity<Topic, UUID> {


    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    @Lob
    private String description;

    @ManyToMany(targetEntity = ArticleEntity.class,fetch = FetchType.LAZY,mappedBy = "topics")
    private Set<ArticleEntity> articles;
}
