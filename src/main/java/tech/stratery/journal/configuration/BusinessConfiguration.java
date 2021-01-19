package tech.stratery.journal.configuration;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.controller.ArticleController;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMapper;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.repository.ArticleRepository;
import tech.stratery.journal.data.service.ArticleDataService;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMapper;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMapperImpl;
import tech.stratery.journal.data.service.mapping.ArticleToEntityMappingWrapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;

@Configuration
@EntityScan("tech.stratery.journal.data.entity")
@EnableJpaRepositories("tech.stratery.journal.data.repository")
@EnableWebMvc
public class BusinessConfiguration {

    @Bean
    public DomainModelMapper<Article, ArticleEntity> domainEntityMapper() {
        return Mappers.getMapper(ArticleToEntityMapper.class);
    }

    @Bean
    public DomainModelMapper<Article, ArticleDTO> domainDTOMapper() {
        return Mappers.getMapper(ArticleToDTOMapper.class);
    }

    @Bean
    public ArticleController articleController(ArticleDomainService service, ArticleToDTOMappingWrapper mapper) {
        return new ArticleController(service, mapper);
    }

    @Bean
    public ArticleToEntityMapper articleToEntityMapper() {
        return new ArticleToEntityMapperImpl();
    }


    @Bean
    public ArticleDataService articleDataService(ArticleRepository repository, ArticleToEntityMappingWrapper mapper) {
        return new ArticleDataService(repository, mapper);
    }

}
