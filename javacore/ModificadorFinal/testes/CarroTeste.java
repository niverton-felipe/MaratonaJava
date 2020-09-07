package abc.com.br.javacore.ModificadorFinal.testes;

import abc.com.br.javacore.ModificadorFinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Goku");
        System.out.println(carro.getComprador());
        //carro.comprador = new Comprador();
    }
}
