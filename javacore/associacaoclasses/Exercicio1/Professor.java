package abc.com.br.javacore.associacaoclasses.Exercicio1;

import java.util.Arrays;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(){

    }

    public String toString(){
        String saida = "------------- Relatório Professor -------------";
        saida += "\nNome: " + nome + "\n";
        saida += "Especialidade: " + especialidade + "\n";
        saida += "Seminários que irá palestrar: \n";
        if (seminarios != null && seminarios.length > 0){
            for (Seminario seminario : seminarios){
                saida += seminario.getTitulo() + "\n";
            }
        }
        else{
            saida += "Professor não vinculado a nenhum seminário\n";
        }
        return saida;
    }

    // Getters e setters
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
