package com.investprojeto.invest_api.controller;

import com.investprojeto.invest_api.model.Ativo;
import com.investprojeto.invest_api.service.AtivoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ativos")
public class AtivoController {

    private final AtivoService service;

    public AtivoController(AtivoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ativo> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Ativo salvar(@RequestBody Ativo ativo) {
        return service.criarAtivo(ativo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
    service.deletar(id);
    }
}