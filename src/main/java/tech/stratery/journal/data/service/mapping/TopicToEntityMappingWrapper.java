package tech.stratery.journal.data.service.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;

@Component
public class TopicToEntityMappingWrapper extends DomainModelMappingWrapper<Topic, TopicEntity> {

    @Autowired
    public TopicToEntityMappingWrapper(TopicToEntityMapper mapper) {
        super(mapper);
    }

}
