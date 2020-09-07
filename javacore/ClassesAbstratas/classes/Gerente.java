package abc.com.br.javacore.ClassesAbstratas.classes;

public class Gerente extends Funcionario {
    public Gerente() {

    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public double calculaSalario(){
        this.salario = salario + (salario * 0.2);
        return salario;
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Salário: R$ " + calculaSalario() +"\n";
        return saida;
    }

}
