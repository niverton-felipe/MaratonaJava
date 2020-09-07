package abc.com.br.javacore.ClassesAbstratas.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(){

    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calculaSalario(){
        this.salario = salario + (totalVendas * 0.05);
        return salario;
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Salário: R$ " + calculaSalario() + "\n";
        return saida;
    }

    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas(){
        return totalVendas;
    }
}
