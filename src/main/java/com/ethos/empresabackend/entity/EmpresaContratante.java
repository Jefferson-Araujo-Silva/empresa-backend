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
        if (plano.getTipo().equals("Plus")){
            desconto = 15.0;
        } else if (plano.getTipo().equals("Pro")){
            desconto = 10.0;
        }
        Double valorMensalidade = planoComDesconto.getValorMensalidade();
        Double valorMensalidadeComDesconto = valorMensalidade - (valorMensalidade * (desconto / 100));
        planoComDesconto.setValorMensalidade(valorMensalidadeComDesconto);

        setPlano(planoComDesconto);
    }

    public void contratarServico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual empresa prestadora deseja contratar?");

    }
}
