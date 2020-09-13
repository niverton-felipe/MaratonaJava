package abc.com.br.javacore.Poliformismo.classes;

public class Gerente extends Funcionario {
    private double pnl;

    public Gerente(){}

    public Gerente(String nome, double salario, double pnl){
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public double calcularPagamento() {
        this.salario += pnl;
        return salario;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
