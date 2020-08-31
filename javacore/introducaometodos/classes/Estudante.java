package abc.com.br.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private float[] notas;
    private boolean aprovado;

    public String situacaoAluno(float... notas) {
        float media = 0;
        String situacaoAluno = "Reprovado";
        for (float nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;
        if (media > 6) {
            this.aprovado = true;
            return situacaoAluno = "Aprovado";
        }
        this.aprovado = false;
        return situacaoAluno;
    }
    // é uma boa prática sempre colocar o .this para deixar implicito
    // que estamos nos referindo aos atributos da classe.
    public void imprimeAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas == null){
            System.out.println("Esse aluno não possui notas cadastradas");
            return;
        }
        String situacaoAluno = situacaoAluno(this.notas);
        System.out.print("Notas: ");
        for (float nota : this.notas){
            System.out.print(nota + " ");
        }
        System.out.println("\nSituação do aluno: " + situacaoAluno);
    }
    //getters and setters
    /*Utilização do get e set para definir ou resgatar o valor dos atrivutos*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Você não pode fazer isso");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(float[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
}
