package tech.stratery.journal.data.service.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.TopicFlowEntity;

@Component
public class TopicFlowToEntityMappingWrapper extends DomainModelMappingWrapper<TopicFlow, TopicFlowEntity> {

    @Autowired
    public TopicFlowToEntityMappingWrapper(TopicFlowToEntityMapper mapper) {
        super(mapper);
    }
}
