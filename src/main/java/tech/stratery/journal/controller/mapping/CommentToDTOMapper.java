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

    @Mappings({
            @Mapping(target="articleId", source = "comment.article.id"),
            @Mapping(target="authorId", source = "comment.author.id")
    })
    CommentDTO forward(Comment comment, CyclicGraphContext context);

    @Mappings({
            @Mapping(source = "commentDTO.articleId", target = "article.id"),
            @Mapping(source = "commentDTO.authorId", target = "author.id")
    })
    Comment back(CommentDTO commentDTO, CyclicGraphContext context);
}
