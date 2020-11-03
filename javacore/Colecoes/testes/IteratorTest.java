package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto(123L, "Teclado", 200,5 );
        Produto p2 = new Produto(113L, "Mouse", 100,0 );
        Produto p3 = new Produto(133L, "Monitor", 1051.1,15 );
        Produto p4 = new Produto(126L, "Impressora", 751.25,0 );

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        //Interface Iterator é uma maneira eficaz de criar um objeto que terá um loop para remover elementos
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext() verifica que ainda há um próximo elemento na coleção
        //next() retorna elemento atual dentro do loop
        while(produtoIterator.hasNext()){
            if (produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        for(Produto produto : produtos){
            System.out.println(produto);
        }

    }
}
