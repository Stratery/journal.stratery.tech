package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.framework.core.mapping.DomainModelMapper;

@Mapper
public interface ArticleToEntityMapper extends DomainModelMapper<Article, ArticleEntity> {
}
