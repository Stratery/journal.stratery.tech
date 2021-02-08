package tech.stratery.journal.business.service;

import org.springframework.stereotype.Service;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;
import tech.stratery.journal.data.service.ArticleDataService;
import tech.stratery.journal.data.service.TopicDataService;

import java.util.UUID;

@Service
public class TopicDomainService extends DomainService<Topic, TopicEntity, UUID> {

    public TopicDomainService(TopicDataService dataService) {
        super(dataService);
    }
}
