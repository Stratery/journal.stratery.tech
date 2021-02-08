package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tech.stratery.framework.core.mapping.CyclicGraphContext;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.controller.dataobject.CommentDTO;

@Mapper
public interface CommentToDTOMapper extends DomainModelMapper<Comment, CommentDTO> {

    @Override
    @Mappings({
            @Mapping(target="articleId", source = "comment.article.id"),
            @Mapping(target="authorId", source = "comment.author.id"),
            @Mapping(target = "authorName", source = "comment.author.name")
    })
    CommentDTO forward(Comment comment, CyclicGraphContext context);

    @Override
    @Mappings({
            @Mapping(source = "commentDTO.articleId", target = "article.id"),
            @Mapping(source = "commentDTO.authorId", target = "author.id"),
            @Mapping(source = "commentDTO.authorName", target = "author.name")
    })
    Comment back(CommentDTO commentDTO, CyclicGraphContext context);
}
