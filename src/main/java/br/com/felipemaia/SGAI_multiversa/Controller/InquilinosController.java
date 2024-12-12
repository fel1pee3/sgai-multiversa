package br.com.felipemaia.SGAI_multiversa.Controller;

import br.com.felipemaia.SGAI_multiversa.Entity.InquilinosEntity;
import br.com.felipemaia.SGAI_multiversa.Service.InquilinosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inquilinos")
public class InquilinosController {

    private InquilinosService inquilinosService;

    public InquilinosController(InquilinosService inquilinosService) {
        this.inquilinosService = inquilinosService;
    }

    @PostMapping
    List<InquilinosEntity> create(@RequestBody InquilinosEntity inquilinos) {
        return inquilinosService.create(inquilinos);
    }

    @GetMapping
    List<InquilinosEntity> list(InquilinosEntity inquilinos) {
        return inquilinosService.list(inquilinos);
    }

    @PutMapping("/{id}")
    List<InquilinosEntity> update(@PathVariable Long id, @RequestBody InquilinosEntity inquilinosAtualizado) {
        return inquilinosService.update(id, inquilinosAtualizado);
    }

    @DeleteMapping("{id}")
    List<InquilinosEntity> delete(@PathVariable("id") Long id) {
        return inquilinosService.delete(id);
    }

}
