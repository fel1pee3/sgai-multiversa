package br.com.felipemaia.SGAI_multiversa.Service;

import br.com.felipemaia.SGAI_multiversa.Entity.ImoveisEntity;
import br.com.felipemaia.SGAI_multiversa.Repository.ImoveisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImoveisService {

    private ImoveisRepository imoveisRepository;

    public ImoveisService(ImoveisRepository imoveisRepository) {
        this.imoveisRepository = imoveisRepository;
    }

    public List<ImoveisEntity> create(ImoveisEntity imovel) {
        imoveisRepository.save(imovel);
        return imoveisRepository.findAll();
    }

    public List<ImoveisEntity> list(ImoveisEntity imoveis) {
        return imoveisRepository.findAll();
    }

    public List<ImoveisEntity> update(Long id, ImoveisEntity imovelAtualizado) {
        Optional<ImoveisEntity> imovelExistente = imoveisRepository.findById(id);

        if (imovelExistente.isPresent()) {
            ImoveisEntity imovel = imovelExistente.get();
            imovel.setEndereco(imovelAtualizado.getEndereco());
            imovel.setTipo(imovelAtualizado.getTipo());
            imovel.setPrecoAluguel(imovelAtualizado.getPrecoAluguel());
            imoveisRepository.save(imovel); // Atualiza o imóvel no banco de dados
        } else {
            throw new RuntimeException("Imovel não encontrado com o ID: " + id);
        }

        return imoveisRepository.findAll();
    }

    public List<ImoveisEntity> delete(Long id) {
        if (imoveisRepository.existsById(id)) {
            imoveisRepository.deleteById(id);
        } else {
            throw new RuntimeException("Imovel não encontrado com o ID: " + id);
        }
        return imoveisRepository.findAll();
    }

}
