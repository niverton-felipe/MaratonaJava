package abc.com.br.javacore.sobrecargaconstrutores.classes;

import java.util.Arrays;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    public String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        // maneira especial de evocar um construtor já criado
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Estudante(){

    }

    public void imprime(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome " + this.nome);
        System.out.print("Notas: ");
        for (double nota : this.notas){
            System.out.print(nota + " ");
        }
        System.out.println("\nData Matricula: " + dataMatricula);
    }

    @Override
    public String toString() {
        String saida = "matrícula: " + matricula + "\n";
        saida += "nome: " + nome + "\n";
        saida += "notas: " + Arrays.toString(notas) + "\n";
        saida += "Data da matricula: " + dataMatricula;
        return  saida;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
