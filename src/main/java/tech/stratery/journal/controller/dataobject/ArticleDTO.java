package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.Article;

import java.util.Set;
import java.util.UUID;

import static java.lang.String.format;

@Data
@EqualsAndHashCode(callSuper = true, exclude = "topics")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ArticleDTO extends DataTransferObject<Article, UUID> {

    // href
    public static final String HREF_PATTERN = "/mvc/article?uuid=%s";

    //Наименование
    private String name;

    // ID Автора
    private UUID authorId;

    // Описание
    public String description;

    //Топики
    private Set<TopicDTO> topics;

    public String getSelfHref() {
        return format(HREF_PATTERN, getId());
    }
}
