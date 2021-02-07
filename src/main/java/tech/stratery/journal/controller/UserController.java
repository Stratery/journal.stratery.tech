package tech.stratery.journal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.business.service.UserDomainService;
import tech.stratery.journal.controller.dataobject.ArticleDTO;
import tech.stratery.journal.controller.dataobject.UserDTO;
import tech.stratery.journal.controller.mapping.ArticleToDTOMappingWrapper;
import tech.stratery.journal.controller.mapping.UserToDTOMappingWrapper;
import tech.stratery.journal.data.entity.UserEntity;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController extends CRUDController<User, UserEntity, UserDTO, UUID> {
    private ArticleToDTOMappingWrapper articleMapper;

    public UserController(UserDomainService service, UserToDTOMappingWrapper mapping, ArticleToDTOMappingWrapper articleMapper) {
        super(service, mapping);
        this.articleMapper = articleMapper;
    }

    @Override
    @PostMapping("create")
    public UserDTO create(@Valid @RequestBody UserDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("get")
    public UserDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }

    @Override
    @GetMapping("")
    public Iterable<UserDTO> get() {
        return super.get();
    }

    @Override
    @PutMapping("update")
    public UserDTO update(@Valid @RequestBody UserDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping ("delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }

    @GetMapping("popular")
    public List<ArticleDTO> getPopularArticles(@RequestParam(name = "userId") UUID userId){
        return getPopularArticlesList(userId);
    }

    private List<ArticleDTO> getPopularArticlesList(UUID userId) {
        return articleMapper.forward(((UserDomainService) service).getPopularArticles(userId));
    }
}
