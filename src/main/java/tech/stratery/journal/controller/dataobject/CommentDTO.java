package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.business.domain.User;

import java.util.UUID;

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommentDTO extends DataTransferObject<Comment, UUID> {
    // статья
    private UUID articleId;

    // Имя автора
    private String authorName;

    // автор комментария
    private UUID authorId;

    // текст комментария
    private String text;
}
