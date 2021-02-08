package tech.stratery.journal.controller;

import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.TopicFlow;
import tech.stratery.journal.business.service.TopicFlowDomainService;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.dataobject.TopicFlowDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.controller.mapping.TopicFlowToDTOMappingWrapper;
import tech.stratery.journal.data.entity.TopicFlowEntity;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("topicflow")
public class TopicFlowController extends CRUDController<TopicFlow, TopicFlowEntity, TopicFlowDTO, UUID> {

    private ArticleToDTOMappingWrapper articleMapping;
    public TopicFlowController(TopicFlowDomainService service, TopicFlowToDTOMappingWrapper mapping, ArticleToDTOMappingWrapper articleMapping) {
        super(service, mapping);
        this.articleMapping = articleMapping;
    }

    @Override
    @PostMapping("create")
    public TopicFlowDTO create(@Valid @RequestBody TopicFlowDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("")
    public Iterable<TopicFlowDTO> get() {
        return super.get();
    }

    @Override
    @GetMapping("get")
    public TopicFlowDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }


    @Override
    @PutMapping("update")
    public TopicFlowDTO update(@Valid @RequestBody TopicFlowDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping("delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }

    @GetMapping("articletopic")
    public List<ArticleDTO> getLastArticles() {
        return getLastArticlesTopicFlow();
    }

    private List<ArticleDTO> getLastArticlesTopicFlow() {
        return articleMapping.forward(((TopicFlowDomainService) service).getLastArticlesTopicFlow());
    }

}
