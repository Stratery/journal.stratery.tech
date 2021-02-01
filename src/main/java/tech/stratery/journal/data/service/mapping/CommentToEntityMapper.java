package tech.stratery.journal.data.service.mapping;

import org.mapstruct.Mapper;
import tech.stratery.framework.core.mapping.DomainModelMapper;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.data.entity.CommentEntity;

@Mapper
public interface CommentToEntityMapper extends DomainModelMapper<Comment, CommentEntity> {
}
