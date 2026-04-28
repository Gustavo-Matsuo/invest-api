package com.investprojeto.invest_api.service;

import com.investprojeto.invest_api.model.Ativo;
import com.investprojeto.invest_api.repository.AtivoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtivoService {

    private final AtivoRepository repository;

    public AtivoService(AtivoRepository repository) {
        this.repository = repository;
    }

    public List<Ativo> listarTodos() {
        return repository.findAll();
    }

    public Ativo criarAtivo(Ativo ativo) {
        
        ativo.setTicker(ativo.getTicker().toUpperCase());
        return repository.save(ativo);
    }

    public void deletar(Long id) {
    repository.deleteById(id);
    }
}