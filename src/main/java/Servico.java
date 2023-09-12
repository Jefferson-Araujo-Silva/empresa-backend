import java.math.BigDecimal;
import java.util.UUID;

public class Servico {
    private UUID id;
    private String nome;
    private String descricao;
    private String setor;
    private BigDecimal valor;

    public Servico(String nome, String descricao, String setor, BigDecimal valor) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.descricao = descricao;
        this.setor = setor;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSetor() {
        return setor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", setor='" + setor + '\'' +
                ", valor=" + valor +
                '}';
    }
}
