package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.dataobject.TopicDTO;

@Component
public class TopicToDTOMappingWrapper extends DomainModelMappingWrapper<Topic, TopicDTO> {

    @Autowired
    public TopicToDTOMappingWrapper(DomainModelMapper<Topic, TopicDTO> mapper) {
        super(mapper);
    }
}
