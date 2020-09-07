package abc.com.br.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(){

    }
    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public String toString(){
        String saida = super.toString();
        saida += "Salário: R$ " + this.salario +"\n";
        return saida;
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de R$ " + this.salario);
    }
    public Double getSalario(){
        return this.salario;
    }
}
