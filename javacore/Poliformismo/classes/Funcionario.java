package abc.com.br.javacore.Poliformismo.classes;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(){}

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString(){
        String saida = "Nome: " + nome + "\n";
        saida += "Salário: R$ " + salario + "\n";
        return saida;
    }

    public abstract double calcularPagamento();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
