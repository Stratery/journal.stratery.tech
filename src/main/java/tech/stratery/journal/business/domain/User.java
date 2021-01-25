package tech.stratery.journal.business.domain;

import lombok.Data;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.UUID;

@Data
public class User extends DomainObject<UUID> {
    private String login;
    private String password;
    private boolean blocked;
    private String name;
    private String email;
}
