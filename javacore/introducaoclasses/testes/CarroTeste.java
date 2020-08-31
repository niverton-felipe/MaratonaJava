package abc.com.br.introducaoclasses.testes;

import abc.com.br.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Celta";
        carro.placa = "BRASIL-1578";
        carro.velocidadeMaxima = 190.0f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }
}
