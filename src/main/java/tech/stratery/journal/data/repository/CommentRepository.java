package tech.stratery.journal.data.repository;

import org.springframework.stereotype.Repository;
import tech.stratery.framework.core.data.jpa.DomainRepository;
import tech.stratery.journal.data.entity.CommentEntity;

import java.util.UUID;

@Repository
public interface CommentRepository extends DomainRepository<CommentEntity, UUID> {
}
