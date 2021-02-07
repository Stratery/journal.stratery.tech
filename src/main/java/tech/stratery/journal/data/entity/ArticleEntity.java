package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Article;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "ARTICLE")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "topics", callSuper = true)
public class ArticleEntity extends DomainJPAEntity<Article, UUID> {

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "text", columnDefinition = "LONGTEXT")
    private String text;

    @ManyToMany(targetEntity = TopicEntity.class, fetch = FetchType.LAZY)
    @JoinTable(
            name = "ARTICLE_TOPIC",
            joinColumns = @JoinColumn (name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id")
    )
    private Set<TopicEntity> topics;
}
