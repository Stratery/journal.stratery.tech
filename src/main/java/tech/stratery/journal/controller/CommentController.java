package tech.stratery.journal.controller;


import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.Comment;
import tech.stratery.journal.business.service.CommentDomainService;
import tech.stratery.journal.controller.dataobject.CommentDTO;
import tech.stratery.journal.controller.dataobject.UserDTO;
import tech.stratery.journal.controller.mapping.CommentToDTOMapperWrapper;
import tech.stratery.journal.data.entity.CommentEntity;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("comment")
public class CommentController extends CRUDController<Comment, CommentEntity, CommentDTO, UUID> {

    public CommentController(CommentDomainService service, CommentToDTOMapperWrapper mapping) {
        super(service, mapping);
    }

    @Override
    @PostMapping("create")
    public CommentDTO create(@Valid @RequestBody CommentDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("get")
    public CommentDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }

    @Override
    @GetMapping("")
    public Iterable<CommentDTO> get() {
        return super.get();
    }

    @Override
    @PutMapping("update")
    public CommentDTO update(@Valid @RequestBody CommentDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping ("delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }
}
