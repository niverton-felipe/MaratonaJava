package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto p1 = new Produto(123L, "Teclado", 200,5 );
        Produto p2 = new Produto(113L, "Mouse", 100,0 );
        Produto p3 = new Produto(133L, "Monitor", 1051.1,15 );
        Produto p4 = new Produto(126L, "Impressora", 751.25,0 );
        // toda coleção que tem o prefixo Hash utiliza hashCode
        // esse tipo de coleção possui alta performance em todos os seus métodos, porém, não permite adicionar
        // elementos duplicados
        // Não ordena os elementos pela ordem de inserção, para manter esse tipo de classificação é possível utilizar
        // a coleção LinkedHashSet<>()
        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(p1);
        produtoSet.add(p2);
        produtoSet.add(p3);
        produtoSet.add(p4);
        for(Produto prod : produtoSet){
            System.out.println(prod);
        }
    }
}
