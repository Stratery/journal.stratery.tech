package tech.stratery.journal.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.stratery.framework.core.data.jpa.DomainRepository;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicFlowEntity;

import java.util.List;
import java.util.UUID;

@Repository
public interface TopicFlowRepository extends DomainRepository<TopicFlowEntity, UUID> {

    @Query("select topic.name, art.name from TopicFlowEntity topic " +
            "join ArticleEntity art on topic.id = art.blog " +
            "join SubscribeEntity sub on topic.id = sub.blog where sub.user = ?1")
    List<ArticleEntity>getLastArticlesTopicFlow();
}
