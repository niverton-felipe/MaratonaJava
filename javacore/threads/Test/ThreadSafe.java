package abc.com.br.javacore.threads.Test;

import java.util.LinkedList;
import java.util.List;

class ListaNomes{
    private List<String> nomes = new LinkedList<>();
    public synchronized void add(String nome){
        nomes.add(nome);
    }
    public synchronized void removerPrimeiro(){
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }
    }
}

public class ThreadSafe {
    public static void main(String[] args) {
        ListaNomes nomes = new ListaNomes();
        nomes.add("Níverton Felipe");
        class RemovedorNomes extends Thread{
            public void run(){
                nomes.removerPrimeiro();
            }
        }
        new RemovedorNomes().start();
        new RemovedorNomes().start();
    }

}
