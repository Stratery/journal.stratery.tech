package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.CyclicGraphContext;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.controller.dataobject.TopicDTO;

@Mapper
public interface TopicToDTOMapper extends DomainModelMapper<Topic, TopicDTO> {
}
