package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "USER")
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
}
