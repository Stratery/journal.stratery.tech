package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
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
public class ArticleEntity extends DomainJPAEntity<Article, UUID> {

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = CommentEntity.class, fetch = FetchType.EAGER, mappedBy = "article")
    private Set<CommentEntity> comments;

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private UserEntity author;

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleEntity)) return false;
        final ArticleEntity other = (ArticleEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ArticleEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }
}
