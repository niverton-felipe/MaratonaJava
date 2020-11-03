package abc.com.br.javacore.Colecoes.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaodeListas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(0);
        numeros.add(7);
        numeros.add(10);
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);
        System.out.println(numeros.toString());
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("-------------------------------");

        Integer[] numerosArray2 = {2,5,9,15,19};
        // Instanciar dessa maneira é uma má prática pois estabelece uma vínculo entre o array e list (ambos compartilharãp
        //o memso endereço na memória heap. Tal ação acaba limitando o crescimento da lista.
        List<Integer> numeros2 = Arrays.asList(numerosArray2);

        // Para evitar criar o vínculo de espaço na memória, instancia-se uma nova array list
        //Em seguida, utiliza-se o método addAll passando um Array.asList como parâmetro.
        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArray2));
        numeros2.set(1,10);

        System.out.println(Arrays.toString(numerosArray2));
        System.out.println(numeros2);
        System.out.println(numeros3);
    }
}
