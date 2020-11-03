package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Celular;
import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class celularNomeComparator implements Comparator<Celular> {
    @Override
    public int compare(Celular celular, Celular t1) {
        return celular.getNome().compareTo(t1.getNome());
    }
}

public class TheeSetTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto(123L, "Teclado", 200,5 );
        Produto p2 = new Produto(113L, "Mouse", 100,0 );
        Produto p3 = new Produto(133L, "Monitor", 1051.1,15 );
        Produto p4 = new Produto(126L, "Impressora", 751.25,0 );
        Celular celular1 = new Celular("Iphone 7", "1243545");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new celularNomeComparator());
        celularNavigableSet.add(celular1);

        //TreetSet só adiciona elementos que possuam a interface comparable implementada ou quando é instanciada
        //passando uma classe que implemente comparator
        for(Celular celular : celularNavigableSet){
            System.out.println(celular);
        }
        produtoNavigableSet.add(p1);
        produtoNavigableSet.add(p2);
        produtoNavigableSet.add(p3);
        produtoNavigableSet.add(p4);
        // TreeSet faz ordenação automática dos seus elementos
        // O desempenho do TreeSet para realizar as comparações é de log(n)
        // descendingSet() inverte a classificação do TreeSet
        for(Produto produto : produtoNavigableSet.descendingSet()){
            System.out.println(produto);
        }
        /*
        * lower < retorna o elemento que está uma posição atrás
        * floor <= retorna o elemento que está uma posição atrás ou na mesma posição
        *higher > retorna o elemento que está uma posução a frente
        * ceilling >= retorna o elemento que está uma posução a frente ou na mesma posição
        * */
        System.out.println(produtoNavigableSet.lower(p4));
        System.out.println(produtoNavigableSet.size()); // retorna tamanho da coleção
        System.out.println(produtoNavigableSet.pollFirst()); // retorna primeiro item da coleção e depois o remove
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast()); // retorna último item da coleção e depois o remove
        System.out.println(produtoNavigableSet.size());
    }
}
