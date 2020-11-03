package abc.com.br.javacore.generics.classes;

public class Carro {
    private String nome;

    public Carro(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        String saida = "Nome: " + nome;
        return saida;
    }

    public String getNome(){
        return this.nome;
    }
}
