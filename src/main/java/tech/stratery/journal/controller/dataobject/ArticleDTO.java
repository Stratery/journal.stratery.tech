package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.Topic;

import java.util.Set;
import java.util.UUID;

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ArticleDTO extends DataTransferObject<Article, UUID> {

    //Наименование
    private String name;

    //Топики
    private Set<Topic> topics;
}
