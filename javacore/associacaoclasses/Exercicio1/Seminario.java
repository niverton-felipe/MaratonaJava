package abc.com.br.javacore.associacaoclasses.Exercicio1;

import java.util.Arrays;

public class Seminario {
    private Professor professor;
    private Aluno[] alunos;
    private Local local;
    private String titulo;


    public Seminario(){

    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String toString(){
        String saida = "------------- Relatório Seminario -------------";
        saida += "\nTitulo: " + titulo + "\n";
        if (professor == null){
            saida += "Professor palestrante ainda não foi definido\n";
        }
        else{
            saida += "Professor palestrante: " + professor.getNome() + "\n";
        }
        saida += "Alunos participantes: " + "\n";
        if (alunos != null && alunos.length > 0){
            for (Aluno aluno : alunos) {
                saida +=  aluno.getNome() + "\n";
            }
        }
        else {
            saida += "Nenhum aluno inscrito ainda\n";
        }
        if (local != null){
            saida += "Local: " + local.getRua() + ", " + local.getBairro() + "\n";
        }else{
            saida += "Local ainda não fora definido\n";
        }

        return saida;
    }

    // getters and setters
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
