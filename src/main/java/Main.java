import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EmpresaContratante empresaContratante = new EmpresaContratante("Empresa Contratante", "123456789", "123456789", "Setor", 10, new Endereco("Rua", "Bairro", "Cidade", "Estado", "Numero", "Complemento", "UF", "CEP"));

        EmpresaPrestadora empresaPrestadora = new EmpresaPrestadora("Empresa Prestadora", "987654321", "987654321", "Setor", 10, new Endereco("Rua", "Bairro", "Cidade", "Estado", "Numero", "Complemento", "UF", "CEP"));

        Servico servico = new Servico("Servico", "Descricao", "Ambiental", new BigDecimal("10.0"));

        empresaPrestadora.adicionarServico(servico);
        empresaPrestadora.adicionarCertificado("Certificado");

        empresaContratante.responderQuestionario();

        empresaContratante.contratarServico(servico);
    }
}
