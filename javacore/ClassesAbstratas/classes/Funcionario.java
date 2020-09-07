package abc.com.br.javacore.ClassesAbstratas.classes;

public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected double salario;

    public Funcionario(){

    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString(){
        String saida = "Nome: " + nome + "\n";
        saida += "Clt: " + clt + "\n";
        return saida;
    }
    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
