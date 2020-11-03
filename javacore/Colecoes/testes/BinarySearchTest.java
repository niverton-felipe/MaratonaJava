package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(0);
        numeros.add(7);
        numeros.add(10);
        // retorno de erro : - (posição onde elemento seria inserido na lista ordenada) - 1
        // antes de evocar o binary search é necessário ordenar o array
        Collections.sort(numeros);
        // método para realizar buscar binária
        System.out.println(Collections.binarySearch(numeros,7));
        // método para retornar valor em umarray
        System.out.println(numeros.get(Collections.binarySearch(numeros,7)));

        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto(123, "Teclado", 200 );
        Produto p2 = new Produto(113, "Mouse", 100 );
        Produto p3 = new Produto(133, "Monitor", 1051.1 );
        Produto p4 = new Produto(126, "Impressora", 751.25 );

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        Collections.sort(produtos, new ComparePorNome());
        // Caso a coleçção tenha sido ordenada por outro critério, é necessário explicitá-lo no binarysearch
        System.out.println(Collections.binarySearch(produtos,p3, new ComparePorNome()));
        for(Produto produto : produtos){
            System.out.println(produto);
        }

    }
}
