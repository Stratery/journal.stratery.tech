package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.controller.dataobject.UserDTO;

@Mapper
public interface UserToDTOMapper extends DomainModelMapper<User, UserDTO> {
}
