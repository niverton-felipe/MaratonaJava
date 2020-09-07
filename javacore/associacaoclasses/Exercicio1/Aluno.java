package abc.com.br.javacore.associacaoclasses.Exercicio1;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private String matricula;
    private int idade;

    public Aluno(){

    }

    public Aluno(String nome, String matricula, int idade ){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    // Override
    @Override
    public String toString(){
        String saida = "------------- Relatório Aluno -------------";
        saida += "\nNome: " + nome +"\n";
        saida += "Matricula: " + matricula +"\n";
        saida += "Idade: " + idade + "\n";
        if (seminario != null){
            saida += "Seminario inscrito: " + seminario.getTitulo() + "\n";
        }
        else{
            saida += "Aluno aind anão está inscrito em nenhum seminario\n";
        }
        return saida;
    }



    //getters and setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public String getNome(){
        return this.nome;
    }

    public String matricula(){
        return this.matricula;
    }

    public int getIdade(){
        return this.idade;
    }

    public Seminario getSeminario(){
        return this.seminario;
    }
}
