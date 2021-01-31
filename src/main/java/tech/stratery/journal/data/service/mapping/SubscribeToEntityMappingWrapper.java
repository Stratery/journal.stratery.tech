package tech.stratery.journal.data.service.mapping;

import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.data.entity.SubscribeEntity;

@Component
public class SubscribeToEntityMappingWrapper extends DomainModelMappingWrapper<Subscribe, SubscribeEntity> {

    public SubscribeToEntityMappingWrapper(SubscribeToEntityMapper mapper){
        super(mapper);
    }
}
