package tech.stratery.journal.business.domain;

import lombok.*;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.UUID;

@Data
public class Topic extends DomainObject<UUID> {

    private String name;
    private String description;

}
