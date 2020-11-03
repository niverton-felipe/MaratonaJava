package abc.com.br.javacore.threads.classes;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;

    public int getEmailsPendentes(){
        synchronized (emails){
            return this.emails.size();
        }
    }

    public String obterEmailMembro(){
        String email = null;
        try{
            synchronized (emails){
                while (this.emails.size() == 0){
                    if (!aberta) return null;
                    System.out.println("Lista vazia, colocando a thread " + Thread.currentThread().getName() + " em modo wait");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return email;
    }

    public void adicionarEmailMembro(String email){
        synchronized (emails){
            this.emails.add(email);
            System.out.println("E-mail adicionado na lista");
            System.out.println("Notificando as threads que estão em espera");
            this.emails.notifyAll();
        }
    }

    public void fecharLista(){
        System.out.println("Notificando todas as Threads e fechando a lista");
        aberta = false;
        synchronized (this.emails){
            this.emails.notifyAll();
        }
    }

    public boolean isAberta(){
        return aberta;
    }


}
