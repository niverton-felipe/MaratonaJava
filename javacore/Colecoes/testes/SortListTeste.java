package abc.com.br.javacore.Colecoes.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Niverton");
        nomes.add("Felipe");
        nomes.add("Juliana");
        nomes.add("Mariana");
        Collections.sort(nomes);
        for(String nome : nomes){
            System.out.println(nome);
        }
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.1);
        numeros.add(1.3);
        numeros.add(1.2);
        numeros.add(1.9);
        numeros.add(1.8);
        Collections.sort(numeros);
        for (Double num : numeros){
            System.out.println(num);
        }
    }
}
