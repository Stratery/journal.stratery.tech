package tech.stratery.framework.core.mapping;

import org.mapstruct.Context;
import tech.stratery.framework.core.domain.DomainObject;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DomainModelMappingWrapper<Source extends DomainObject, Target> {

    private DomainModelMapper<Source, Target> mapper;

    public DomainModelMappingWrapper(DomainModelMapper<Source, Target> mapper) {
        this.mapper = mapper;
    }

/* Default methods for mapping to Target */
    public Target forward(Source source){
        return mapper.forward(source, new CyclicGraphContext());
    }

    public List<Target> forward(List<Source> objects){
        return this.forward(objects, new CyclicGraphContext());
    }

    private List<Target> forward(List<Source> sources, @Context CyclicGraphContext context){
        return sources.stream().map(x -> mapper.forward(x, context)).collect(Collectors.toList());
    }

    public Source back(Target target) {
        return mapper.back(target, new CyclicGraphContext());
    }

    public List<Source> back(List<Target> objects){
        return this.back(objects, new CyclicGraphContext());
    }

    private List<Source> back(List<Target> objects, @Context CyclicGraphContext context){
        return objects.stream().map(x -> mapper.back(x, context)).collect(Collectors.toList());
    }
}
