package tech.stratery.journal.business.domain;

import lombok.Data;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.UUID;

@Data
public class Comment extends DomainObject<UUID> {
    private User author;
    private String text;
    private Article article;
}
