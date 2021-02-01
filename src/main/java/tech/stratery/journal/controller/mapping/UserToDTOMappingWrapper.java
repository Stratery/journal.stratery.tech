package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.controller.dataobject.UserDTO;

@Component
public class UserToDTOMappingWrapper extends DomainModelMappingWrapper<User, UserDTO> {

    @Autowired
    public UserToDTOMappingWrapper(UserToDTOMapper mapper) {
        super(mapper);
    }
}
