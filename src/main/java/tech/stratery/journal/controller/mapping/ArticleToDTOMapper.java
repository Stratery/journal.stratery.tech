package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.framework.core.mapping.DomainModelMapper;

@Mapper
public interface ArticleToDTOMapper extends DomainModelMapper<Article, ArticleDTO> {
}
