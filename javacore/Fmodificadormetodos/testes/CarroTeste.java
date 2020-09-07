package abc.com.br.javacore.Fmodificadormetodos.testes;

import abc.com.br.javacore.Fmodificadormetodos.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        // Definindo de maneira direta o conteúdo de um atributo estático.
        // método é evocado diretamente da classe.
        // Só funciona para atrivutos estáticos públicos
        //Carro.velocidadeLimite = 250;
        Carro.setVelocidadeLimite(220);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


    }
}
