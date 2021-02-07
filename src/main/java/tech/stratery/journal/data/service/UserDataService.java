package tech.stratery.journal.data.service;

import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.data.entity.UserEntity;
import tech.stratery.journal.data.repository.ArticleRepository;
import tech.stratery.journal.data.repository.UserRepository;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMappingWrapper;
import tech.stratery.journal.data.service.mapping.UserToEntityMappingWrapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class UserDataService extends DomainDataService<User, UserEntity, UUID> {
    private ArticleRepository articleRepository;
    private ArticleToEntityMappingWrapper articleMapping;
    public UserDataService(UserRepository repository,
                           UserToEntityMappingWrapper mapping,
                           ArticleRepository articleRepository,
                           ArticleToEntityMappingWrapper articleMapping) {
        super(repository, mapping);
        this.articleRepository = articleRepository;
        this.articleMapping = articleMapping;
    }

    public List<Article> getPopularArticlesByUser(UUID userId) {
        List<Article> articles = articleMapping.back(articleRepository.getArticleEntityByComments());

        return articles.stream()
                .filter(article -> article.getAuthor().getId().equals(userId))
                .collect(Collectors.toList());
    }
}
