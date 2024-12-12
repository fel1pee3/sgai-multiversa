package br.com.felipemaia.SGAI_multiversa.Service;

import br.com.felipemaia.SGAI_multiversa.Entity.InquilinosEntity;
import br.com.felipemaia.SGAI_multiversa.Repository.InquilinosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquilinosService {

    private InquilinosRepository inquilinosRepository;

    public InquilinosService(InquilinosRepository inquilinosRepository) {
        this.inquilinosRepository = inquilinosRepository;
    }

    public List<InquilinosEntity> create(InquilinosEntity inquilinos) {
        inquilinosRepository.save(inquilinos);
        return inquilinosRepository.findAll();
    }

    public List<InquilinosEntity> list(InquilinosEntity inquilinos) {
        return inquilinosRepository.findAll();
    }

    public List<InquilinosEntity> update(Long id, InquilinosEntity inquilinoAtualizado) {
        Optional<InquilinosEntity> inquilinoExistente = inquilinosRepository.findById(id);

        if (inquilinoExistente.isPresent()) {
            InquilinosEntity inquilino = inquilinoExistente.get();
            inquilino.setNome(inquilinoAtualizado.getNome());
            inquilino.setEmail(inquilinoAtualizado.getEmail());
            inquilino.setTelefone(inquilinoAtualizado.getTelefone());
            inquilinosRepository.save(inquilino);
        } else {
            throw new RuntimeException("Inquilino não encontrado com o ID: " + id);
        }

        return inquilinosRepository.findAll();
    }

    public  List<InquilinosEntity> delete(Long id){
        if (inquilinosRepository.existsById(id)) {
            inquilinosRepository.deleteById(id);
        } else {
            throw new RuntimeException("Imovel não encontrado com o ID: " + id);
        }
        return inquilinosRepository.findAll();
    }

}
