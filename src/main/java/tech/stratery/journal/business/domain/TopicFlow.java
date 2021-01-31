package tech.stratery.journal.business.domain;

import lombok.Data;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.UUID;

@Data
public class TopicFlow extends DomainObject<UUID> {

    private String name;
    private User administrator;
}
