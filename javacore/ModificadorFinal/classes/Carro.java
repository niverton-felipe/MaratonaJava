package abc.com.br.javacore.ModificadorFinal.classes;

public class Carro {
    private String nome;
    private String carro;
    public static final double VELOCIDADE_LIMITE = 250;
    private final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString(){
        String saida = "Nome: " + nome +"\n";
        saida += "Carro: " + carro;
        return saida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public Comprador getComprador(){
        return this.COMPRADOR;
    }

}
