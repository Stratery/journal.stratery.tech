package tech.stratery.journal.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.TopicFlowEntity;
import tech.stratery.journal.data.repository.TopicFlowRepository;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMappingWrapper;
import tech.stratery.journal.data.service.mapping.TopicFlowToEntityMappingWrapper;

import java.util.List;
import java.util.UUID;

@Component
public class TopicFlowDataService extends DomainDataService<TopicFlow, TopicFlowEntity, UUID> {

    private TopicFlowRepository repository;
    private ArticleToEntityMappingWrapper articleMapping;

    @Autowired
    public TopicFlowDataService(TopicFlowRepository repository, TopicFlowToEntityMappingWrapper mapping, ArticleToEntityMappingWrapper articleMapping) {
        super(repository, mapping);
        this.repository = repository;
        this.articleMapping = articleMapping;
    }

    public List<Article>getLastArticlesTopicFlow(){
        return articleMapping.back(repository.getLastArticlesTopicFlow());
    }
}
