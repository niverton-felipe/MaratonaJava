package abc.com.br.javacore.Interfaces.classes;

public class Produto implements Tributável, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double valorFrete;
    private double precoFinal;


    public Produto(){

    }

    public Produto(String nome, double peso, double preco){
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString(){
        String saida = "Nome: " + nome + "\n";
        saida += "Peso: " + peso + "\n";
        saida += "Preço Inicial: " + preco + "\n";
        saida += "Preço com Imposto: R$ " + calculaImposto() + "\n";
        saida += "Valor frete: R$ " + calculaFrete() + "\n";

        return saida;
    }

    @Override
    public double calculaImposto(){
        this.precoFinal = this.preco + (this.preco * IMPOSTO);
        return precoFinal;
    }

    @Override
    public double calculaFrete(){
        this.valorFrete = (this.preco * 0.1) / this.peso;
        return valorFrete;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }


}

