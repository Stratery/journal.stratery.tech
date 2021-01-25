package tech.stratery.journal.data.service.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.data.entity.UserEntity;

@Component
public class UserToEntityMappingWrapper extends DomainModelMappingWrapper<User, UserEntity> {

    @Autowired
    public UserToEntityMappingWrapper(UserToEntityMapper mapper) {
        super(mapper);
    }
}
