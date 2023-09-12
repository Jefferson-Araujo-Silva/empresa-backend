public abstract class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String setor;
    private Integer qtdFuncionarios;
    private Endereco endereco;
    private Plano plano;
    public Empresa(String razaoSocial, String cnpj, String telefone, String setor, Integer qtdFuncionarios, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.setor = setor;
        this.qtdFuncionarios = qtdFuncionarios;
        this.endereco = endereco;
    }

    public void escolherPlano(Plano plano){
        this.plano = plano;
    }


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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
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

    @Override
    public String toString() {
        return "Empresa{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                ", setor='" + setor + '\'' +
                ", qtdFuncionarios=" + qtdFuncionarios +
                ", endereco=" + endereco +
                '}';
    }
}
