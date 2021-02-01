package tech.stratery.journal.controller.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.controller.dataobject.CommentDTO;

@Mapper
public interface CommentToDTOMapper extends DomainModelMapper<Comment, CommentDTO> {
}
