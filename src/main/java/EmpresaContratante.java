import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaContratante extends Empresa{
    List<Servico> servicosContratados = new ArrayList<>() ;
    public EmpresaContratante(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios, Endereco endereco) {
        super(razaoSocial, cnpj, telefone, setor, qtdFuncionarios, endereco);
    }

    public void responderQuestionario(){
        System.out.println("Respondendo questionario...");
    }

    public void contratarServico(Servico servico){
        System.out.println("Valor do servico: " + servico.getValor());
        System.out.println("Deseja contratar o servico?");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();

        if(resposta.equals("sim")){
            System.out.println("Servico contratado!");
        }else{
            System.out.println("Servico não contratado!");
        }
    }
}
