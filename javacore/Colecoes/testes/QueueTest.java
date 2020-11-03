package abc.com.br.javacore.Colecoes.testes;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Tipo de coleção que fará ordenação automaticamente dos seus elementos
        // O tipo que for passado deve implementar a interface comparable
        Queue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("A");
        queue.add("D");
        queue.add("C");
        System.out.println(queue);
        System.out.println(queue.remove()); // remove primeiro elemento da fila
        System.out.println(queue.peek()); // retorna o primeiro elemento da fila
        System.out.println(queue.poll()); // retorna o primeiro elemento da fila e o remove
        System.out.println(queue.size()); // retorna o tamanho da fila
    }
}
