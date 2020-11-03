package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Celular;

public class EqualsTeste {
    public static void main(String[] args) {
        // No caso de strings e variavéis do tipo primitivo o "=="
        //compara local da memória. Para que sejam comparado o conteúdo
        // das variáveis é necessário utilizar o método equals
        String nome = "Niverton Felipe";
        String nome2 = new String("Niverton Felipe");
        System.out.println(nome.equals(nome2));
        Celular c1 = new Celular("iPhone", "04546-4");
        Celular c2 = new Celular("iPhone", "04546-5");
        System.out.println(c1.equals(c2));
    }
}
