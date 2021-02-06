package tech.stratery.journal.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.repository.ArticleRepository;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMappingWrapper;
import tech.stratery.framework.core.data.DomainDataService;

import java.util.List;
import java.util.UUID;

@Component
public class ArticleDataService extends DomainDataService<Article, ArticleEntity, UUID> {

    @Autowired
    public ArticleDataService(ArticleRepository repository, ArticleToEntityMappingWrapper mapper) {
        super(repository, mapper);
    }

}
