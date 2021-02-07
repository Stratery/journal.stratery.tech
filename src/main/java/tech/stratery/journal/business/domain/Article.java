package tech.stratery.journal.business.domain;

import lombok.*;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.Set;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true, exclude = "topics")
public class Article extends DomainObject<UUID> {

    private String name;

    public String description;

    private Set<Topic> topics;

}
