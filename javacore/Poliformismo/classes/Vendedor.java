package abc.com.br.javacore.Poliformismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(){

    }

    public Vendedor(String nome, double salario, double totalVendas){
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString(){
        String saida = super.toString();
        saida += "Vendas: R$" + totalVendas + "\n";
        return saida;
    }

    @Override
    public double calcularPagamento() {
        this.salario += (totalVendas * 0.05);
        return  salario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
