import java.util.ArrayList;
import java.util.List;

public class EmpresaPrestadora extends Empresa{
    private List<Servico> servicosPrestados;
    private List<String> certificados;

    public EmpresaPrestadora(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios, Endereco endereco) {
        super(razaoSocial, cnpj, telefone, setor, qtdFuncionarios, endereco);
        this.servicosPrestados = new ArrayList<>();
        this.certificados = new ArrayList<>();
    }

    public void adicionarServico(Servico servico){
        this.servicosPrestados.add(servico);
    }

    public void adicionarCertificado(String certificado){
        this.certificados.add(certificado);
    }

    public void removerCertificado(String certificado){
        this.certificados.remove(certificado);
    }

    public void removerServico(Servico servico){
        this.servicosPrestados.remove(servico);
    }

    public List<Servico> getServicosPrestados() {
        return servicosPrestados;
    }

    public List<String> getCertificados() {
        return certificados;
    }

    @Override
    public String toString() {
        return "EmpresaPrestadora{" + "servicosPrestados=" + servicosPrestados + ", certificados=" + certificados + '}';
    }

}
