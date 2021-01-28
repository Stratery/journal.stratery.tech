package tech.stratery.journal.controller;

import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.business.service.TopicDomainService;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.dataobject.TopicDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.controller.mapping.TopicToDTOMappingWrapper;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/topic")
public class TopicController extends CRUDController<Topic, TopicEntity, TopicDTO, UUID> {

    public TopicController(TopicDomainService service, TopicToDTOMappingWrapper mapping) {
        super(service, mapping);
    }

    @Override
    @PostMapping("/create")
    public TopicDTO create(@Valid @RequestBody TopicDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("")
    public Iterable<TopicDTO> get() {
        return super.get();
    }

    @Override
    @GetMapping("/get")
    public TopicDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }


    @Override
    @PutMapping("/update")
    public TopicDTO update(@Valid @RequestBody TopicDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }
}