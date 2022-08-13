package com.AgendaDeContatosv2.Agendav2.service;

import com.AgendaDeContatosv2.Agendav2.model.AgendaModel;
import com.AgendaDeContatosv2.Agendav2.respository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {
    @Autowired
    AgendaRepository repository;

    public List<AgendaModel> buscarTodosContatos(){
        return repository.findAll();
    }

    public Optional<AgendaModel> buscarContatoPorNome(Long id){
        return repository.findById(id);

    }
    public AgendaModel cadastrar (AgendaModel agendaModel){

        agendaModel.getId();
        agendaModel.getNome();
        agendaModel.getTelefone();

        return repository.save(agendaModel);
    } public AgendaModel alterar (AgendaModel agendaModel){

        agendaModel.getId();
        agendaModel.getNome();
        agendaModel.getTelefone();

        return repository.save(agendaModel);
    }
    public void deletar (Long id){
        repository.deleteById(id);

    }

}
