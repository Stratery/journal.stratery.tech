package tech.stratery.journal.business.service;

import org.springframework.stereotype.Service;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.data.entity.SubscribeEntity;
import tech.stratery.journal.data.service.SubscribeDataService;


import java.util.UUID;

@Service
public class SubscribeDomainService extends DomainService<Subscribe, SubscribeEntity, UUID> {

    public SubscribeDomainService(SubscribeDataService dataService) {
        super(dataService);
    }
}
