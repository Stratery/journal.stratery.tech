package tech.stratery.framework.core.mapping;

import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import tech.stratery.framework.core.domain.DomainObject;

public interface DomainModelMapper<Source extends DomainObject, Target> {

    Target forward(Source source, @Context CyclicGraphContext context);

    @InheritInverseConfiguration
    Source back(Target target, @Context CyclicGraphContext context);
}
