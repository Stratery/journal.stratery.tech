package tech.stratery.journal.business.service;

import org.springframework.stereotype.Component;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.data.entity.UserEntity;
import tech.stratery.journal.data.service.UserDataService;

import java.util.UUID;

@Component
public class UserDomainService extends DomainService<User, UserEntity, UUID> {

    public UserDomainService(UserDataService dataService) {
        super(dataService);
    }
}
