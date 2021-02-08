package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.Topic;

import java.util.Set;
import java.util.UUID;

import static java.lang.String.format;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TopicDTO extends DataTransferObject<Topic, UUID> {

    // href
    public static final String HREF_PATTERN = "/mvc/topic?uuid=%s";

    //Наименование
    private String name;

    //Описание
    private String description;

    // Статьи
    @EqualsAndHashCode.Exclude
    private Set<ArticleDTO> articles;

    public String getSelfHref() {
        return format(HREF_PATTERN, getId());
    }
}
