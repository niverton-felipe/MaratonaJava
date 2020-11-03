package abc.com.br.javacore.serializacao.testes;

import abc.com.br.javacore.serializacao.classes.Aluno;
import abc.com.br.javacore.serializacao.classes.Turma;

import java.io.*;

public class SerializacaoTeste {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    private static void gravadorObjeto(){
        Turma turma = new Turma("Maratona Java");
        Aluno aluno = new Aluno(1L, "Niverton Felipe", "124354");
        aluno.setTurma(turma);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))){
            oos.writeObject(aluno);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void leitorObjeto(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
