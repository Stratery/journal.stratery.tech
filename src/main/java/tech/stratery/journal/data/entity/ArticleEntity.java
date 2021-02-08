package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;
import org.hibernate.type.TextType;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Article;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "ARTICLE")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleEntity extends DomainJPAEntity<Article, UUID> {

    @Column(name = "name")
    private String name;

    @Column(name = "blog")
    private UUID blog;

    @Column(name = "date")
    private Date date;

    @ManyToOne(targetEntity = TopicFlowEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "blog_id", referencedColumnName = "id")
    private TopicFlowEntity topic;

    @OneToMany(targetEntity = CommentEntity.class, fetch = FetchType.EAGER, mappedBy = "article")
    @EqualsAndHashCode.Exclude
    private Set<CommentEntity> comments;

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @EqualsAndHashCode.Exclude
    private UserEntity author;

    @Column(name = "description")
    @Lob
    private String description;

    @Column(name = "text")
    @Lob
    private String text;

    @ManyToMany(targetEntity = TopicEntity.class, fetch = FetchType.LAZY)
    @JoinTable(
            name = "ARTICLE_TOPIC",
            joinColumns = @JoinColumn (name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id", referencedColumnName = "id")
    )
    @EqualsAndHashCode.Exclude
    private Set<TopicEntity> topics;
}
