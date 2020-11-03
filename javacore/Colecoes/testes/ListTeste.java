package abc.com.br.javacore.Colecoes.testes;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Níverton Felipe");
        nomes.add("Mariana Oliveira");
        nomes.add("Antunes Anderfran");
        nomes2.add("Ronniere Costa");
        nomes2.add("Brenda Costa");
        // método para adicionar uma coleção dentr do ArrayList
        nomes.addAll(nomes2);


//        for (String nome : nomes){
//            System.out.println(nome);
//        }
        // Outra forma de usar forEach
        //nomes.forEach(System.out::println);
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
