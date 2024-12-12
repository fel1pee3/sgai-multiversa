package br.com.felipemaia.SGAI_multiversa.Service;

import br.com.felipemaia.SGAI_multiversa.Entity.ProprietariosEntity;
import br.com.felipemaia.SGAI_multiversa.Repository.ProprietariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietariosService {

    private ProprietariosRepository proprietariosRepository;

    public ProprietariosService(ProprietariosRepository proprietariosRepository) {
        this.proprietariosRepository = proprietariosRepository;
    }

    public List<ProprietariosEntity> create(ProprietariosEntity proprietarios) {
        proprietariosRepository.save(proprietarios);
        return proprietariosRepository.findAll();
    }

    public List<ProprietariosEntity> list(ProprietariosEntity proprietarios) {
        return proprietariosRepository.findAll();
    }

    public List<ProprietariosEntity> update(Long id, ProprietariosEntity proprietarioAtualizado) {
        Optional<ProprietariosEntity> proprietarioExistente = proprietariosRepository.findById(id);

        if (proprietarioExistente.isPresent()) {
            ProprietariosEntity proprietario = proprietarioExistente.get();
            proprietario.setNome(proprietarioAtualizado.getNome());
            proprietario.setEmail(proprietarioAtualizado.getEmail());
            proprietario.setTelefone(proprietarioAtualizado.getTelefone());
            proprietariosRepository.save(proprietario);
        } else {
            throw new RuntimeException("Proprietário não encontrado com o ID: " + id);
        }

        return proprietariosRepository.findAll();
    }

    public  List<ProprietariosEntity> delete(Long id){
        if (proprietariosRepository.existsById(id)) {
            proprietariosRepository.deleteById(id);
        } else {
            throw new RuntimeException("Imovel não encontrado com o ID: " + id);
        }
        return proprietariosRepository.findAll();
    }

}
