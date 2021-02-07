package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tech.stratery.framework.core.mapping.CyclicGraphContext;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.framework.core.mapping.DomainModelMapper;

@Mapper
public interface ArticleToDTOMapper extends DomainModelMapper<Article, ArticleDTO> {
    @Override
    @Mappings({
            @Mapping(target = "authorId", source = "article.author.id")
    })
    ArticleDTO forward(Article article, CyclicGraphContext context);

    @Override
    @Mappings({
            @Mapping(source = "articleDTO.authorId", target = "author.id")
    })
    Article back(ArticleDTO articleDTO, CyclicGraphContext context);
}
