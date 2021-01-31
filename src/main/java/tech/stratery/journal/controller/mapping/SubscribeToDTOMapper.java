package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.controller.dataobject.SubscribeDTO;

@Mapper
public interface SubscribeToDTOMapper extends DomainModelMapper<Subscribe, SubscribeDTO> {
}
