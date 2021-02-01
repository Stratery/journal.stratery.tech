package tech.stratery.journal.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.data.entity.CommentEntity;
import tech.stratery.journal.data.repository.CommentRepository;
import tech.stratery.journal.data.service.mapping.CommentToEntityMappingWrapper;

import java.util.UUID;

@Component
public class CommentDataService extends DomainDataService<Comment, CommentEntity, UUID> {

    @Autowired
    public CommentDataService(CommentRepository repository, CommentToEntityMappingWrapper mapping) {
        super(repository, mapping);
    }
}
