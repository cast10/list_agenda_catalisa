package com.AgendaDeContatosv2.Agendav2.controller;

import com.AgendaDeContatosv2.Agendav2.model.AgendaModel;
import com.AgendaDeContatosv2.Agendav2.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaController {
    @Autowired
    AgendaService service;

    @GetMapping(path = "/agenda")
    public List<AgendaModel> buscarcontatos(){
        return service.buscarTodosContatos();
    }

    @GetMapping(path = "/agenda/{nomeDoContato}")
    public Optional<AgendaModel> buscarPorNome (@PathVariable Long id){
        return service.buscarContatoPorNome(id);

    }

    @PostMapping(path = "/agenda")
    public AgendaModel cadastrarContato(@RequestBody AgendaModel agendaModel){
        return service.cadastrar(agendaModel);
    }

    @PutMapping(path = "/agenda{id}")
    public AgendaModel alterarContato (@RequestBody AgendaModel agendaModel){
        return service.alterar(agendaModel);

    }
    @DeleteMapping(path = "/agenda{id}")
    public void deletarContato (@PathVariable Long id ){
        service.deletar(id);

    }

}
