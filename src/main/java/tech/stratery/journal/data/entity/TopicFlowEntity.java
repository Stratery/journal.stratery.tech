package tech.stratery.journal.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.stratery.framework.core.data.jpa.DomainJPAEntity;
import tech.stratery.journal.business.domain.TopicFlow;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "BLOGS")
@AllArgsConstructor
@NoArgsConstructor
public class TopicFlowEntity extends DomainJPAEntity<TopicFlow, UUID> {

    @Column(name = "name")
    private String name;

}
