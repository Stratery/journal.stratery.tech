package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.controller.dataobject.TopicFlowDTO;

@Component
public class TopicFlowToDTOMappingWrapper extends DomainModelMappingWrapper<TopicFlow, TopicFlowDTO> {

    @Autowired
    public TopicFlowToDTOMappingWrapper(DomainModelMapper<TopicFlow, TopicFlowDTO> mapper) {
        super(mapper);
    }
}
