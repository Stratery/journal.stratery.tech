package tech.stratery.journal.data.repository;

import lombok.NonNull;
import tech.stratery.framework.core.data.jpa.DomainRepository;
import tech.stratery.journal.data.entity.TopicEntity;

import java.util.Optional;
import java.util.UUID;

public interface TopicRepository extends DomainRepository<TopicEntity, UUID> {
}
