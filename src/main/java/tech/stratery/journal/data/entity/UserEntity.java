package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.User;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "BLOG_USER")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends DomainJPAEntity<User, UUID> {
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "blocked")
    private boolean blocked;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @OneToMany(targetEntity = ArticleEntity.class, fetch = FetchType.EAGER, mappedBy = "author")
    private Set<ArticleEntity> articles;

    @OneToMany(targetEntity = CommentEntity.class, fetch = FetchType.EAGER, mappedBy = "author")
    private Set<CommentEntity> comments;

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserEntity)) return false;
        final UserEntity other = (UserEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        if (this$login == null ? other$login != null : !this$login.equals(other$login)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        if (this.isBlocked() != other.isBlocked()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $login = this.getLogin();
        result = result * PRIME + ($login == null ? 43 : $login.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        result = result * PRIME + (this.isBlocked() ? 79 : 97);
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }
}
