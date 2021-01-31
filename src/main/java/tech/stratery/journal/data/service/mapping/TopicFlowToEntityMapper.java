package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.TopicFlowEntity;

@Mapper
public interface TopicFlowToEntityMapper extends DomainModelMapper<TopicFlow, TopicFlowEntity> {
}
