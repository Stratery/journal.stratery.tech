package tech.stratery.journal.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.data.entity.SubscribeEntity;
import tech.stratery.journal.data.repository.SubscribeRepository;
import tech.stratery.journal.data.service.mapping.SubscribeToEntityMappingWrapper;

import java.util.UUID;

@Component
public class SubscribeDataService extends DomainDataService<Subscribe, SubscribeEntity, UUID> {

    @Autowired
    public  SubscribeDataService(SubscribeRepository repository, SubscribeToEntityMappingWrapper mapper){
        super(repository,mapper);
    }
}
