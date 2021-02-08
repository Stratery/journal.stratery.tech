package tech.stratery.journal.controller.dataobject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import tech.stratery.framework.core.controller.DataTransferObject;
import tech.stratery.journal.business.domain.TopicFlow;

import java.util.UUID;

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TopicFlowDTO extends DataTransferObject<TopicFlow, UUID> {

    private String name;
}
