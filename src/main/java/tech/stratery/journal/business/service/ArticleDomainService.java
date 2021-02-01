package tech.stratery.journal.business.service;

import org.springframework.stereotype.Service;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.data.service.ArticleDataService;

import java.util.List;
import java.util.UUID;

@Service
public class ArticleDomainService extends DomainService<Article, ArticleEntity, UUID> {

    public ArticleDomainService(ArticleDataService dataService) {
        super(dataService);
    }

    public List<Article> getArticleEntityByComments(){
        return ((ArticleDataService) dataService).getArticleEntityByComments();
    }
}
