package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.*;

class ComparePorNome implements Comparator<Produto>{

    @Override
    public int compare(Produto produto, Produto t1) {
        return produto.getNome().compareTo(t1.getNome());
    }
}

public class SortProdutoTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto(123, "Teclado", 200 );
        Produto p2 = new Produto(113, "Mouse", 100 );
        Produto p3 = new Produto(133, "Monitor", 1051.1 );
        Produto p4 = new Produto(126, "Impressora", 751.25 );

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        Produto[] produtosArray = {p1,p2,p3,p4};

//        Collections.sort(produtos, new ComparePorNome());
//        for(Produto produto : produtos){
//            System.out.println(produto);
//        }
        Arrays.sort(produtosArray, new ComparePorNome());
        for(Produto produto : produtosArray){
            System.out.println(produto);
        }
    }
}
