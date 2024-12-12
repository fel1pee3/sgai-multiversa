package br.com.felipemaia.SGAI_multiversa.Controller;

import br.com.felipemaia.SGAI_multiversa.Entity.AlugueisEntity;
import br.com.felipemaia.SGAI_multiversa.Service.AlugueisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alugueis")
public class AlugueisController {
    private AlugueisService alugueisService;

    public AlugueisController(AlugueisService alugueisService) {
        this.alugueisService = alugueisService;
    }

    @PostMapping
    List<AlugueisEntity> create(@RequestBody AlugueisEntity alugueis) {
        return alugueisService.create(alugueis);
    }

    @GetMapping
    List<AlugueisEntity> list(AlugueisEntity alugueis) {
        return alugueisService.list(alugueis);
    }

    @PutMapping("/{id}")
    public List<AlugueisEntity> update(@PathVariable Long id, @RequestBody AlugueisEntity alugueisAtualizado) {
        return alugueisService.update(id, alugueisAtualizado);
    }

    @DeleteMapping("{id}")
    List<AlugueisEntity> delete(@PathVariable("id") Long id) {
        return alugueisService.delete(id);
    }

}
