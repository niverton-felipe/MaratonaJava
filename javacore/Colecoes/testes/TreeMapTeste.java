package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTeste {
    public static void main(String[] args) {
    // Tipo passado como key deve implementar o comparable
        //Ordenação é feita automaticamente
        NavigableMap<String, Consumidor> map = new TreeMap<>();
        Consumidor consumidor1 = new Consumidor("João Paulo", "12456489");
        Consumidor consumidor2 = new Consumidor("Alailma Sousa", "82356569");
        map.put("A", consumidor1);
        map.put("D",consumidor2);
//        map.put("C", "Letra C");
//        map.put("B", "Letra B");

        /*
        *lower < retorna o elemento que está uma posição atrás
        *floor <= retorna o elemento que está uma posição atrás ou na mesma posição
        *higher > retorna o elemento que está uma posição a frente
        *ceilling >= retorna o elemento que está uma posução a frente ou na mesma posição
        */

        for(Map.Entry<String, Consumidor> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue().getNome());
        }
        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C"));
    }
}
