package tech.stratery.journal.business.service;

import org.springframework.stereotype.Service;
import tech.stratery.framework.core.data.DomainDataService;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.data.entity.CommentEntity;

import java.util.UUID;

@Service
public class CommentDomainService extends DomainService<Comment, CommentEntity, UUID> {
    public CommentDomainService(DomainDataService<Comment, CommentEntity, UUID> dataService) {
        super(dataService);
    }
}
