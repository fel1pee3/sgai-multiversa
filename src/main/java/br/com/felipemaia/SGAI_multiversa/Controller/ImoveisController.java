package br.com.felipemaia.SGAI_multiversa.Controller;

import br.com.felipemaia.SGAI_multiversa.Entity.ImoveisEntity;
import br.com.felipemaia.SGAI_multiversa.Service.ImoveisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImoveisController {

    private ImoveisService imoveisService;

    public ImoveisController(ImoveisService imoveisService) {
        this.imoveisService = imoveisService;
    }

    @PostMapping
    List<ImoveisEntity> create(@RequestBody ImoveisEntity imoveis) {
        return imoveisService.create(imoveis);
    }

    @GetMapping
    List<ImoveisEntity> list(ImoveisEntity imoveis) {
        return imoveisService.list(imoveis);
    }

    @PutMapping("/{id}")
    public List<ImoveisEntity> update(@PathVariable Long id, @RequestBody ImoveisEntity imoveisAtualizado) {
        return imoveisService.update(id, imoveisAtualizado);
    }

    @DeleteMapping("{id}")
    List<ImoveisEntity> delete(@PathVariable("id") Long id) {
        return imoveisService.delete(id);
    }

}
