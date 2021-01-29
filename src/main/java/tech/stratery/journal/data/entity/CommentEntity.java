package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.Comment;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "COMMENTS")
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity extends DomainJPAEntity<Comment, UUID> {

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION) //при удалении пользователя оставляем комментарии
    private UserEntity author;

    @ManyToOne(targetEntity = ArticleEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE) //при удалении статьи комментарии не нужны
    private ArticleEntity article;

    @Column(name = "text")
    private String text;
}
