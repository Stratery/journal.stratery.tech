package tech.stratery.journal.controller;

import org.springframework.web.bind.annotation.*;

import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.framework.core.controller.CRUDController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("article")
public class ArticleController extends CRUDController<Article, ArticleEntity, ArticleDTO, UUID> {

    public ArticleController(ArticleDomainService service, ArticleToDTOMappingWrapper mapping) {
        super(service, mapping);
    }

    @Override
    @PostMapping("create")
    public ArticleDTO create(@Valid @RequestBody ArticleDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("")
    public Iterable<ArticleDTO> get() {
        return super.get();
    }

    @Override
    @GetMapping("get")
    public ArticleDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }


    @Override
    @PutMapping("update")
    public ArticleDTO update(@Valid @RequestBody ArticleDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping("delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }
}