package tech.stratery.journal.business.service;

import org.springframework.stereotype.Service;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.TopicFlowEntity;
import tech.stratery.journal.data.service.TopicFlowDataService;

import java.util.UUID;

@Service
public class TopicFlowDomainService extends DomainService<TopicFlow, TopicFlowEntity, UUID> {

    public TopicFlowDomainService(TopicFlowDataService dataService) {
        super(dataService);
    }
}
