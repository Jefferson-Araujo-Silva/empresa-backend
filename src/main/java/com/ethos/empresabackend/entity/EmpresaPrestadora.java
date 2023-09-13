package com.ethos.empresabackend.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaPrestadora extends Empresa {
    private final List<String> certificados;

    public EmpresaPrestadora(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios) {
        super(razaoSocial, cnpj, telefone, setor, qtdFuncionarios);
        this.certificados = new ArrayList<>();
    }

    @Override
    public void escolherPlano(Plano plano) {
        double desconto = 12.0;
        Plano planoComDesconto = new Plano(plano.getId(), plano.getTipo(), plano.getValorMensalidade(), plano.getQtdMeses());
        Double valorMensalidade = planoComDesconto.getValorMensalidade();
        Double valorMensalidadeComDesconto = valorMensalidade - (valorMensalidade * (desconto / 100));
        planoComDesconto.setValorMensalidade(valorMensalidadeComDesconto);
        setPlano(planoComDesconto);
    }

    public void adicionarServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do servico:");
        String nome = scanner.nextLine();
        System.out.println("Informe a descricao do servico:");
        String descricao = scanner.nextLine();
        System.out.println("Informe o setor do servico:");
        String setor = scanner.nextLine();
        System.out.println("Informe o valor do servico:");
        BigDecimal valor = scanner.nextBigDecimal();

    }

    public void adicionarCertificado(String certificado) {
        this.certificados.add(certificado);
    }

    public void removerCertificado(String certificado) {
        this.certificados.remove(certificado);
    }

    public List<String> getCertificados() {
        return certificados;
    }

    @Override
    public String toString() {
        return "EmpresaPrestadora{" +
                "certificados=" + certificados +
                '}';
    }
}
