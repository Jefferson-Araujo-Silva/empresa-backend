package com.ethos.empresabackend.entity;

import java.util.UUID;

public abstract class Empresa {
    private UUID id;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String setor;
    private Integer qtdFuncionarios;
    private Plano plano;
    public Empresa(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios) {
        this.id = UUID.randomUUID();
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.setor = setor;
        this.qtdFuncionarios = qtdFuncionarios;
        this.plano = new Plano(1, "gratuito", 0.0, 0);
    }

    public abstract void escolherPlano(Plano plano);


    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setQtdFuncionarios(Integer qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSetor() {
        return setor;
    }

    public Integer getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                ", setor='" + setor + '\'' +
                ", qtdFuncionarios=" + qtdFuncionarios +
                ", plano=" + plano +
                '}';
    }
}
