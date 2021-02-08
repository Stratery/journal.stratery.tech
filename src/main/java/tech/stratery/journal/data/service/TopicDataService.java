package tech.stratery.journal.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.controller.mapping.TopicToDTOMappingWrapper;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;
import tech.stratery.journal.data.repository.ArticleRepository;
import tech.stratery.journal.data.repository.TopicRepository;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMappingWrapper;
import tech.stratery.journal.data.service.mapping.TopicToEntityMappingWrapper;

import java.util.UUID;

@Component
public class TopicDataService extends DomainDataService<Topic, TopicEntity, UUID> {

    @Autowired
    public TopicDataService(TopicRepository repository, TopicToEntityMappingWrapper mapper) {
        super(repository, mapper);
    }
}
