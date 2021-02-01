package tech.stratery.journal.controller.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.controller.dataobject.CommentDTO;

@Component
public class CommentToDTOMapperWrapper extends DomainModelMappingWrapper<Comment, CommentDTO> {

    @Autowired
    public CommentToDTOMapperWrapper(CommentToDTOMapper mapper) {
        super(mapper);
    }
}
