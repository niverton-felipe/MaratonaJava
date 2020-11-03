package abc.com.br.javacore.Colecoes.testes;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        //Map <Tipo de dado chave, tipo de dado valor>
        //Não pode ser adicionadas elementos com a mesma chave
        // Não é possível garantir a ordenação dos elementos
        Map<String, String> map = new HashMap<>();
        map.put("vc","você");
        map.put("mouze","mouse");
        map.put("teklado","teclado");
        //ao invés de ignorar a adição de chave duplicada,o HashMap o sobrepõe
        //map.put("vc","você2");
        // iterando com forEach para retornar as chaves do HashMap
        for(String key : map.keySet()){
            System.out.println(key);
        }
        // iterando com forEach para retornar os valores do HashMap
        for(String key : map.values()){
            System.out.println(key);
        }

        // iterando com forEach para retornar chave e valor dos elementos do hashMap utilizando a interface Entry
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
