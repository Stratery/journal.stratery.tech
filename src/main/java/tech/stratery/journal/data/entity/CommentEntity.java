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

    @ManyToOne(targetEntity = ArticleEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE) //при удалении статьи комментарии не нужны
    private ArticleEntity article;

    @Column(name = "text")
    private String text;

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CommentEntity)) return false;
        final CommentEntity other = (CommentEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CommentEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        return result;
    }
}
