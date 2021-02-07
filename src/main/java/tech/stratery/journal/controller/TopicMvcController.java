package tech.stratery.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.framework.core.logic.DomainService;
import tech.stratery.framework.core.mapping.DomainModelMappingWrapper;
import tech.stratery.journal.business.domain.Topic;
import tech.stratery.journal.controller.dataobject.TopicDTO;
import tech.stratery.journal.data.entity.TopicEntity;

import java.util.UUID;

@Controller
@RequestMapping("/mvc/topic")
public class TopicMvcController extends CRUDController<Topic, TopicEntity, TopicDTO, UUID> {

    protected TopicMvcController(DomainService<Topic, TopicEntity, UUID> service, DomainModelMappingWrapper<Topic, TopicDTO> mapping) {
        super(service, mapping);
    }

    @GetMapping({"/main"})
    public String mainPage(Model model) {
        model.addAttribute("header_title", "Привет, мой любознательный друг!");
        model.addAttribute("header_text", "Это блог, в котором можно найти много увлекательно новых и бескрайне  интересных постов на различные темы!");
        model.addAttribute("dies", this.get());
        return "jumbotron-dies-template";
    }

    @GetMapping
    public String topic(Model model, @RequestParam("uuid") String uuid) {
        final TopicDTO dto = this.get(UUID.fromString(uuid));

        model.addAttribute("header_title", dto.getName());
        model.addAttribute("header_text", dto.getDescription());

        model.addAttribute("dies", dto.getArticles());
        return "jumbotron-dies-template";
    }
}