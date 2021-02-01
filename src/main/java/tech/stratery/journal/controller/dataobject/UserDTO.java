package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.User;

import java.util.UUID;

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO extends DataTransferObject<User, UUID> {
    // логин
    private String login;

    // Пароль
    private String password;

    // признак блокировки
    private boolean blocked;

    // наименование
    private String name;

    // email
    private String email;
}
