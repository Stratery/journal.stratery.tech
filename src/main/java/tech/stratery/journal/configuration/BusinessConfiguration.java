package tech.stratery.journal.configuration;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.business.service.CommentDomainService;
import tech.stratery.journal.business.service.UserDomainService;
import tech.stratery.journal.business.service.SubscribeDomainService;
import tech.stratery.journal.business.service.TopicFlowDomainService;
import tech.stratery.journal.controller.ArticleController;
import tech.stratery.journal.controller.mapping.ArticleToDTOMapper;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.controller.mapping.TopicToDTOMapper;
import tech.stratery.journal.controller.CommentController;
import tech.stratery.journal.controller.UserController;
import tech.stratery.journal.controller.UserWebController;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.mapping.*;
import tech.stratery.journal.controller.SubscribeController;
import tech.stratery.journal.controller.TopicFlowController;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.mapping.*;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.repository.ArticleRepository;
import tech.stratery.journal.data.repository.CommentRepository;
import tech.stratery.journal.data.repository.UserRepository;
import tech.stratery.journal.data.repository.SubscribeRepository;
import tech.stratery.journal.data.repository.TopicFlowRepository;
import tech.stratery.journal.data.service.ArticleDataService;
import tech.stratery.journal.data.service.mapping.*;
import tech.stratery.journal.data.service.CommentDataService;
import tech.stratery.journal.data.service.UserDataService;
import tech.stratery.journal.data.service.mapping.*;
import tech.stratery.journal.data.service.SubscribeDataService;
import tech.stratery.journal.data.service.TopicFlowDataService;
import tech.stratery.journal.data.service.mapping.*;
import tech.stratery.framework.core.mapping.DomainModelMapper;

@Configuration
@EntityScan("tech.stratery.journal.data.entity")
@EnableJpaRepositories("tech.stratery.journal.data.repository")
public class BusinessConfiguration {

    @Bean
    public ArticleToDTOMapper articleDTOMapper() {
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

    @Bean
    public TopicFlowToDTOMapper topicFlowToDTOMapper(){
        return Mappers.getMapper(TopicFlowToDTOMapper.class);
    }

    @Bean
    public TopicFlowController topicFlowController(TopicFlowDomainService service, TopicFlowToDTOMappingWrapper mapping, ArticleToDTOMappingWrapper articleMapping) {
        return new TopicFlowController(service, mapping, articleMapping);
    }

    @Bean
    public TopicFlowToEntityMapper topicFlowToEntityMapper(){
        return new TopicFlowToEntityMapperImpl();
    }

    @Bean
    public TopicFlowDataService topicFlowDataService(TopicFlowRepository repository, TopicFlowToEntityMappingWrapper mapper, ArticleToEntityMappingWrapper articleMapping){
        return new TopicFlowDataService(repository, mapper, articleMapping);
    }

    @Bean
    public SubscribeToDTOMapper subscribeToDTOMapper(){
        return Mappers.getMapper(SubscribeToDTOMapper.class);
    }

    @Bean
    public SubscribeController subscribeController(SubscribeDomainService service, SubscribeToDTOMappingWrapper mapping) {
        return new SubscribeController(service, mapping);
    }

    @Bean
    public SubscribeToEntityMapper subscribeToEntityMapper(){
        return new SubscribeToEntityMapperImpl();
    }

    @Bean
    public SubscribeDataService subscribeDataService(SubscribeRepository repository, SubscribeToEntityMappingWrapper mapper){
        return new SubscribeDataService(repository, mapper);
    }



    @Bean
    public UserToDTOMapper userDTOMapper() {
        return Mappers.getMapper(UserToDTOMapper.class);
    }

    @Bean
    public UserController userController(UserDomainService service, UserToDTOMappingWrapper mapper, ArticleToDTOMappingWrapper articleMapper) {
        return new UserController(service, mapper, articleMapper);
    }

    @Bean
    public UserToEntityMapper userToEntityMapper() {
        return new UserToEntityMapperImpl();
    }

    @Bean
    public UserDataService userDataService(UserRepository repository,
                                           UserToEntityMappingWrapper mapper,
                                           ArticleRepository articleRepository,
                                           ArticleToEntityMappingWrapper articleMapping) {
        return new UserDataService(repository, mapper, articleRepository, articleMapping);
    }

    @Bean
    public CommentToDTOMapper commentToDTOMapper() {
        return Mappers.getMapper(CommentToDTOMapper.class);
    }

    @Bean
    public CommentController commentController(CommentDomainService service, CommentToDTOMapperWrapper mapper) {
        return new CommentController(service, mapper);
    }

    @Bean
    public CommentToEntityMapper commentToEntityMapper () {
        return new CommentToEntityMapperImpl();
    }

    @Bean
    public CommentDataService commentDataService(CommentRepository repository, CommentToEntityMappingWrapper wrapper) {
        return new CommentDataService(repository, wrapper);
    }

    @Bean
    public UserWebController userWebController(UserDomainService service, ArticleToDTOMappingWrapper articleMapper) {
        return new UserWebController(service, articleMapper);
    }
    @Bean
    public TopicToDTOMapper topicDTOMapper() {
        return Mappers.getMapper(TopicToDTOMapper.class);
    }

    @Bean
    public TopicToEntityMapper topicToEntityMapper() {
        return new TopicToEntityMapperImpl();
    }

}
