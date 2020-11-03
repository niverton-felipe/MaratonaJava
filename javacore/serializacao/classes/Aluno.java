package abc.com.br.javacore.serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    //essa propriedade garante que o valor do password não seja retornado na serialização
    private transient String password;
    private transient Turma turma;
    private static String nomeEscola = "DevDojo";

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Aluno(){

    }

    @Override
    public String toString(){
    String saida = "Id: "+ id +"\n";
    saida += "Nome: "+ nome +"\n";
    saida += "Password: "+ password +"\n";
    saida += "Turma: "+ turma.getNome() +"\n";
    saida += "Nome da escola: "+ nomeEscola +"\n";
    return saida;
    }

    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public void setTurma (Turma turma){
        this.turma = turma;
    }

    public Turma getTurma(){
        return turma;
    }

}
