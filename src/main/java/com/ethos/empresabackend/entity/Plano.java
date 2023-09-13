package com.ethos.empresabackend.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Plano {
    private int id;
    private String tipo;
    private Double valorMensalidade;
    private Integer qtdMeses;
    private LocalDate prazoExpiracao;
    public Plano(int id, String tipo, Double valorMensalidade, Integer qtdMeses) {
        this.id = id;
        this.tipo = tipo;
        this.valorMensalidade = valorMensalidade;
        this.qtdMeses = qtdMeses;

    }

    public Double calculaValorMensalidade() {
        return this.valorMensalidade * this.qtdMeses;
    }

    public void calcularPrazoExpiracao() {
        LocalDate prazoExpiracao = LocalDate.now().plusMonths(this.qtdMeses);
    }

    public Double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public Integer getQtdMeses() {
        return qtdMeses;
    }

    public void setQtdMeses(Integer qtdMeses) {
        this.qtdMeses = qtdMeses;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
