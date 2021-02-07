package tech.stratery.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tech.stratery.journal.business.service.UserDomainService;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;

import java.util.UUID;

@Controller
public class UserWebController {
    private ArticleToDTOMappingWrapper articleMapper;
    private UserDomainService service;

    public UserWebController(UserDomainService service, ArticleToDTOMappingWrapper articleMapper) {
        this.articleMapper = articleMapper;
        this.service = service;
    }

    @RequestMapping(value = "userPopularArticle", method = RequestMethod.GET)
    public String viewPopularArticle(Model model, @RequestParam(name = "userId") UUID userId) {
        model.addAttribute("articles", articleMapper.forward(service.getPopularArticles(userId)));
        return "userArticles";
    }
}
