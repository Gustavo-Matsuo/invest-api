package com.investprojeto.invest_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ticker; 
    private Double precoMedio;
    private Double quantidade;

        public Double getQuantidade() {
        return quantidade;
    }  

        public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    } 
}