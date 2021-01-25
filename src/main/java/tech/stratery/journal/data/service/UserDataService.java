package tech.stratery.journal.data.service;

import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.data.entity.UserEntity;
import tech.stratery.journal.data.repository.UserRepository;
import tech.stratery.journal.data.service.mapping.UserToEntityMappingWrapper;

import java.util.UUID;

@Component
public class UserDataService extends DomainDataService<User, UserEntity, UUID> {
    public UserDataService(UserRepository repository, UserToEntityMappingWrapper mapping) {
        super(repository, mapping);
    }
}
