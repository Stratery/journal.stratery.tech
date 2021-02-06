package tech.stratery.journal.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.framework.core.data.jpa.DomainRepository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ArticleRepository extends DomainRepository<ArticleEntity, UUID> {
    @Query("select a from ArticleEntity a, TopicEntity c " +
            "where c.article = a group by a order by count(c) desc")
    List<ArticleEntity> getArticleEntityByTopic();

}
