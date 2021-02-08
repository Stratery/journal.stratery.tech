package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
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
    @EqualsAndHashCode.Exclude
    private Set<ArticleEntity> articles;

    @OneToMany(targetEntity = CommentEntity.class, fetch = FetchType.EAGER, mappedBy = "author")
    @EqualsAndHashCode.Exclude
    private Set<CommentEntity> comments;
}
