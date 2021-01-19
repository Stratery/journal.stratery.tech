package tech.stratery.journal.data.repository;

import org.springframework.stereotype.Repository;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.framework.core.data.jpa.DomainRepository;

import java.util.UUID;

@Repository
public interface ArticleRepository extends DomainRepository<ArticleEntity, UUID> {
}
