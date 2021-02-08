package tech.stratery.journal.business.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.stratery.framework.core.domain.DomainObject;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class Comment extends DomainObject<UUID> {
    @EqualsAndHashCode.Exclude
    private User author;

    private String text;

    @EqualsAndHashCode.Exclude
    private Article article;
}
