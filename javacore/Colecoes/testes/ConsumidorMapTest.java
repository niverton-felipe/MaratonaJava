package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Consumidor;
import abc.com.br.javacore.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Produto p1 = new Produto(123L, "Teclado", 200, 5);
        Produto p2 = new Produto(113L, "Mouse", 100, 0);
        Produto p3 = new Produto(133L, "Monitor", 1051.1, 15);
        Produto p4 = new Produto(126L, "Impressora", 751.25, 0);
        Consumidor consumidor1 = new Consumidor("João Paulo", "12456489");
        Consumidor consumidor2 = new Consumidor("Alailma Sousa", "82356569");

        List<Produto> produtosCons1 = new ArrayList<>();
        produtosCons1.add(p1);
        produtosCons1.add(p2);
        List<Produto> produtosCons2 = new ArrayList<>();
        produtosCons2.add(p3);
        produtosCons2.add(p4);

        Map<Consumidor, List<Produto>> map = new HashMap<>();
        map.put(consumidor1, produtosCons1);
        map.put(consumidor2, produtosCons2);

        for(Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }

    }
}
