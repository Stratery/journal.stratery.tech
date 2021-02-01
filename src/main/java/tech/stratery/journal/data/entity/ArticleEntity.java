package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.User;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "ARTICLE")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ArticleEntity extends DomainJPAEntity<Article, UUID> {

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = CommentEntity.class, fetch = FetchType.EAGER, mappedBy = "article")
    private Set<CommentEntity> comments;

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private UserEntity author;

}
