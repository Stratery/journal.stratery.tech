package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.data.entity.UserEntity;

@Mapper
public interface UserToEntityMapper extends DomainModelMapper<User, UserEntity> {
}