package abc.com.br.javacore.generics.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable{

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}
public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        //consultarAnimais(cachorros);
        //consultarAnimais(gatos);
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        // argumento Collection aceita apenas a superclasse
        //consultarAnimaisList(gatoList);
        List<Animal> animalList = new ArrayList<>();
        consultarAnimaisList(gatoList);
        ordenarLista(cachorroList);
    }

    public static void consultarAnimais(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }

    public static void consultarAnimaisList(List<? extends Animal> animals){
        // o Wildcard(caractere coringa) estende as possibilidades de passagem do argumento,
        //permitindo que qualquer subclasse seja utilizada.
        //o caractere coringa impede que adição seja feita dentro do método
        //animals.add(new Cachorro());
        //animals.add(new Gato());
        for (Animal animal : animals){
            animal.consulta();
        }
    }
    // essa implementação permite que super classe e a própria classe cachorro sejam adicionadas
    // ao arrayList
    public static void consultarCachorroList(List<? super Cachorro> cachorroList){
        Cachorro c1 = new Cachorro();
        Animal c2 = new Cachorro();
        Object c3 = new Cachorro();
        cachorroList.add(new Cachorro());
    }

    // durante o uso do caractere coringa (?) sempre se usará a palavra "extends"
    // o uso de Comparable obrigará que argumento implemente essa interface para
    // que seja possível realizar ordenação
    public static void ordenarLista(List<? extends Comparable> lista){

        Collections.sort(lista);
    }
}
