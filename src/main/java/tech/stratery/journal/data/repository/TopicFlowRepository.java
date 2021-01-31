package tech.stratery.journal.data.repository;

import org.springframework.stereotype.Repository;
import tech.stratery.framework.core.data.jpa.DomainRepository;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.data.entity.TopicFlowEntity;

import java.util.UUID;

@Repository
public interface TopicFlowRepository extends DomainRepository<TopicFlowEntity, UUID> {
}
