package abc.com.br.javacore.serializacao.classes;

import java.io.Serializable;
// Teste sem implenetar o Serializable (implements Serializable)
public class Turma {
    private String nome;

    public Turma(){

    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
