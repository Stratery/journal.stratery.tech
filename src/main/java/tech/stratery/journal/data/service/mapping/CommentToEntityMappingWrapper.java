package tech.stratery.journal.data.service.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.data.entity.CommentEntity;

@Component
public class CommentToEntityMappingWrapper extends DomainModelMappingWrapper<Comment, CommentEntity> {
    @Autowired
    public CommentToEntityMappingWrapper(CommentToEntityMapper mapper) {
        super(mapper);
    }
}
