package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.controller.dataobject.TopicFlowDTO;

@Mapper
public interface TopicFlowToDTOMapper extends DomainModelMapper<TopicFlow, TopicFlowDTO> {
}
