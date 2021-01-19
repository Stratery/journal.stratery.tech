package tech.stratery.journal.data.service.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.data.entity.ArticleEntity;

import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;

@Component
public class ArticleToEntityMappingWrapper extends DomainModelMappingWrapper<Article, ArticleEntity> {

    @Autowired
    public ArticleToEntityMappingWrapper(ArticleToEntityMapper mapper) {
        super(mapper);
    }

}
