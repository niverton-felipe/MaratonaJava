package abc.com.br.javacore.generics.classes;

public class Computador {
    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        String saida = "Nome: " + nome;
        return saida;
    }

    public String getNome() {
        return nome;
    }
}
