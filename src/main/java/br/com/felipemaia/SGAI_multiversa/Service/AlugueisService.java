package br.com.felipemaia.SGAI_multiversa.Service;

import br.com.felipemaia.SGAI_multiversa.Entity.AlugueisEntity;
import br.com.felipemaia.SGAI_multiversa.Repository.AlugueisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlugueisService {
    private AlugueisRepository alugueisRepository;

    public AlugueisService(AlugueisRepository alugueisRepository) {
        this.alugueisRepository = alugueisRepository;
    }

    public List<AlugueisEntity> create(AlugueisEntity aluguel) {
        alugueisRepository.save(aluguel);
        return alugueisRepository.findAll();
    }

    public List<AlugueisEntity> list(AlugueisEntity alugueis) {
        return alugueisRepository.findAll();
    }

    public List<AlugueisEntity> update(Long id, AlugueisEntity aluguelAtualizado) {
        Optional<AlugueisEntity> aluguelExistente = alugueisRepository.findById(id);

        if (aluguelExistente.isPresent()) {
            AlugueisEntity aluguel = aluguelExistente.get();
            aluguel.setImovel(aluguelAtualizado.getImovel());
            aluguel.setInquilino(aluguelAtualizado.getInquilino());
            aluguel.setDataInicio(aluguelAtualizado.getDataInicio());
            aluguel.setDataFim(aluguelAtualizado.getDataFim());
            aluguel.setStatus(aluguelAtualizado.getStatus());
            alugueisRepository.save(aluguel); // Atualiza o aluguel
        } else {
            throw new RuntimeException("Aluguel não encontrado com o ID: " + id);
        }

        return alugueisRepository.findAll();
    }

    public List<AlugueisEntity> delete(Long id) {
        if (alugueisRepository.existsById(id)) {
            alugueisRepository.deleteById(id);
        } else {
            throw new RuntimeException("Aluguel não encontrado com o ID: " + id);
        }
        return alugueisRepository.findAll();
    }
}
