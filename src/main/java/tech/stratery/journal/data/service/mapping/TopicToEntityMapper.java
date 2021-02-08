package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;

@Mapper
public interface TopicToEntityMapper extends DomainModelMapper<Topic, TopicEntity> {
}
