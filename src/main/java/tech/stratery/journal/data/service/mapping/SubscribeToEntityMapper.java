package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.data.entity.SubscribeEntity;

@Mapper
public interface SubscribeToEntityMapper extends DomainModelMapper<Subscribe, SubscribeEntity> {
}
