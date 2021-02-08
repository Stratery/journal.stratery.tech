package tech.stratery.journal.controller;

import org.springframework.web.bind.annotation.*;
import tech.stratery.framework.core.controller.CRUDController;
import tech.stratery.journal.business.domain.Subscribe;
import tech.stratery.journal.business.service.SubscribeDomainService;
import tech.stratery.journal.controller.dataobject.SubscribeDTO;
import tech.stratery.journal.controller.mapping.SubscribeToDTOMappingWrapper;
import tech.stratery.journal.data.entity.SubscribeEntity;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("subscribe")
public class SubscribeController extends CRUDController<Subscribe, SubscribeEntity, SubscribeDTO, UUID> {

    public SubscribeController(SubscribeDomainService service, SubscribeToDTOMappingWrapper mapping) {
        super(service, mapping);
    }

    @Override
    @PostMapping("create")
    public SubscribeDTO create(@Valid @RequestBody SubscribeDTO dto) {
        return super.create(dto);
    }

    @Override
    @GetMapping("")
    public Iterable<SubscribeDTO> get() {
        return super.get();
    }

    @Override
    @GetMapping("get")
    public SubscribeDTO get(@RequestParam(name = "id") UUID uuid) {
        return super.get(uuid);
    }


    @Override
    @PutMapping("update")
    public SubscribeDTO update(@Valid @RequestBody SubscribeDTO dto) {
        return super.update(dto);
    }

    @Override
    @DeleteMapping("delete")
    public void delete(@RequestParam(name = "id") UUID uuid) {
        super.delete(uuid);
    }
}
