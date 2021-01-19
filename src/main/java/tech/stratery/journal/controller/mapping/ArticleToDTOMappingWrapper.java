package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;

@Component
public class ArticleToDTOMappingWrapper extends DomainModelMappingWrapper<Article, ArticleDTO> {

    @Autowired
    public ArticleToDTOMappingWrapper(DomainModelMapper<Article, ArticleDTO> mapper) {
        super(mapper);
    }
}
