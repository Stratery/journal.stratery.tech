package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.controller.dataobject.SubscribeDTO;

@Component
public class SubscribeToDTOMappingWrapper extends DomainModelMappingWrapper<Subscribe, SubscribeDTO> {

    @Autowired
    public SubscribeToDTOMappingWrapper(DomainModelMapper<Subscribe, SubscribeDTO> mapper) {
        super(mapper);
    }
}
