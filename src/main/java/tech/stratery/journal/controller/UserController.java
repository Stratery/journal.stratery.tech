package tech.stratery.journal.controller;

import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.User;
import tech.stratery.journal.business.service.UserDomainService;
import tech.stratery.journal.controller.dataobject.UserDTO;
import tech.stratery.journal.controller.mapping.UserToDTOMappingWrapper;
import tech.stratery.journal.data.entity.UserEntity;

import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController extends CRUDController<User, UserEntity, UserDTO, UUID> {

    public UserController(UserDomainService service, UserToDTOMappingWrapper mapping) {
        super(service, mapping);
    }

    @Override
    @PostMapping("create")
    public UserDTO create(UserDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("get")
    public UserDTO get(UUID uuid) {
        return super.get(uuid);
    }

    @Override
    @GetMapping("")
    public Iterable<UserDTO> get() {
        return super.get();
    }

    @Override
    @PutMapping("update")
    public UserDTO update(UserDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping ("delete")
    public void delete(UUID uuid) {
        super.delete(uuid);
    }
}
