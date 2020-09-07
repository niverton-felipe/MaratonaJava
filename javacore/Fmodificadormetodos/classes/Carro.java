package abc.com.br.javacore.Fmodificadormetodos.classes;

public class Carro {
    //velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    //Construtores
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(){

    }

    // métodos
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + velocidadeLimite);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    // setters e getters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

}
