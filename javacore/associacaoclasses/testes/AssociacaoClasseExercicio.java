package abc.com.br.javacore.associacaoclasses.testes;

import abc.com.br.javacore.associacaoclasses.Exercicio1.Aluno;
import abc.com.br.javacore.associacaoclasses.Exercicio1.Local;
import abc.com.br.javacore.associacaoclasses.Exercicio1.Professor;
import abc.com.br.javacore.associacaoclasses.Exercicio1.Seminario;

public class AssociacaoClasseExercicio {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Níverton Felipe", "091654", 26);
        Aluno aluno1 = new Aluno("Calebe Evangelista", "124569", 18);
        Professor professor = new Professor("Eduardo Falcao", "Algoritmos");
        Seminario seminario = new Seminario("Iniciação à algoritmos");
        Local local = new Local("Rua José Fernandes Moscoso", "Serrotão", "Campina Grande");
        aluno.setSeminario(seminario);
        aluno1.setSeminario(seminario);
        Seminario seminario1 = new Seminario("Introdução à Machine Learning");

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno,aluno1});
        System.out.println(seminario);
        professor.setSeminarios(new Seminario[]{seminario});
        System.out.println(professor);
        System.out.println(aluno);
        System.out.println(seminario1);

    }

}
