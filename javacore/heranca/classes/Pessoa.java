package abc.com.br.javacore.heranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    //Sobrecarga de método
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public String toString(){
        String saida = "Nome: " + this.nome + "\n";
        saida += "CPF: " + this.cpf + "\n";
        if (endereco != null){
            saida += "Rua: " + this.endereco.getRua() + "\n";
            saida += "Bairro: " + this.endereco.getBairro() + "\n";
        }
        else{
            saida += "Endereço não informado";
        }
        return saida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
