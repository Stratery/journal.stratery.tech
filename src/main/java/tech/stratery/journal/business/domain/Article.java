package tech.stratery.journal.business.domain;

import lombok.*;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.Set;
import java.util.UUID;

@Data
public class Article extends DomainObject<UUID> {

    private String name;
    private Set<Comment> comments;
    private User author;
}
