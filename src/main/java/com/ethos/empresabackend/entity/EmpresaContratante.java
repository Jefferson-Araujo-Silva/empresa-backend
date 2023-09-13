package com.ethos.empresabackend.entity;

import java.util.Scanner;

public class EmpresaContratante extends Empresa {
    public EmpresaContratante(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios) {
        super(razaoSocial, cnpj, telefone, setor, qtdFuncionarios);
    }

    @Override
    public void escolherPlano(Plano plano) {
        Plano planoComDesconto = new Plano(plano.getId(), plano.getTipo(), plano.getValorMensalidade(), plano.getQtdMeses());
        Double desconto = 0.0;
        if (plano.getTipo().equals("plus")){
            desconto = 15.0;
        } else if (plano.getTipo().equals("pro")){
            desconto = 10.0;
        }
        setPlano(plano);
    }

    public void contratarServico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual empresa prestadora deseja contratar?");

    }
}
