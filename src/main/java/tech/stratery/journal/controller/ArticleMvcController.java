package tech.stratery.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Article;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.business.service.ArticleDomainService;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.dataobject.TopicDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.data.entity.ArticleEntity;
import tech.stratery.journal.data.entity.TopicEntity;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/mvc/article")
public class ArticleMvcController extends CRUDController<Article, ArticleEntity, ArticleDTO, UUID> {

    protected ArticleMvcController(ArticleDomainService service, ArticleToDTOMappingWrapper mapping) {
        super(service, mapping);
    }

    @GetMapping
    public String topic(Model model, @RequestParam("uuid") String uuid) {
        final ArticleDTO dto = this.get(UUID.fromString(uuid));

        model.addAttribute("header_title", dto.getName());
        model.addAttribute("header_text", dto.getDescription());
        model.addAttribute("comments", dto.getComments());
        return "jumbotron-dies-template";
    }
}