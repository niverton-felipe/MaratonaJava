package abc.com.br.javacore.classesinternas.testes;


import abc.com.br.javacore.generics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal{
    public void andar(){
        System.out.println("Andando");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        // foi criado uma classe anônima para mudar o comportamento do método andar
        Animal a = new Animal(){
            public void andar(){
                System.out.println("Andando anonimamente");
            }
        };
        a.andar();

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Audi"));
        Collections.sort(carroList, new Comparator<Carro>() {
          @Override
          public int compare(Carro o1, Carro o2){
              return o1.getNome().compareTo(o2.getNome());
          }
        });
        System.out.println(carroList);
    }
}
