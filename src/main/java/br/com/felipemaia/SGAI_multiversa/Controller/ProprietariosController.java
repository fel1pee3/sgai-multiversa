package br.com.felipemaia.SGAI_multiversa.Controller;

import br.com.felipemaia.SGAI_multiversa.Entity.ProprietariosEntity;
import br.com.felipemaia.SGAI_multiversa.Service.ProprietariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprietarios")
public class ProprietariosController {

    private ProprietariosService proprietariosService;

    public ProprietariosController(ProprietariosService proprietariosService) {
        this.proprietariosService = proprietariosService;
    }

    @PostMapping
    List<ProprietariosEntity> create(@RequestBody ProprietariosEntity proprietarios) {
        return proprietariosService.create(proprietarios);
    }

    @GetMapping
    List<ProprietariosEntity> list(ProprietariosEntity proprietarios) {
        return proprietariosService.list(proprietarios);
    }

    @PutMapping("/{id}")
    public List<ProprietariosEntity> update(@PathVariable Long id, @RequestBody ProprietariosEntity proprietariosAtualizado) {
        return proprietariosService.update(id, proprietariosAtualizado);
    }

    @DeleteMapping("{id}")
    List<ProprietariosEntity> delete(@PathVariable("id") Long id) {
        return proprietariosService.delete(id);
    }

}
