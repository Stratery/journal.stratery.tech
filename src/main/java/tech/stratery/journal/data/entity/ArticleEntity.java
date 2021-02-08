package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "ARTICLE")
@AllArgsConstructor
@NoArgsConstructor
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
}
