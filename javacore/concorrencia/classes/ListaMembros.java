package abc.com.br.javacore.concorrencia.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock1 = lock.newCondition();
    private boolean aberta = true;

    public int getEmailsPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            lock.lock();
            while (this.emails.size() == 0) {
                if (!aberta) return null;
                System.out.println("Lista vazia, colocando a thread " + Thread.currentThread().getName() + " em modo wait");
                conditionLock1.await();
            }
            email = this.emails.poll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return email;
    }

    public void adicionarEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("E-mail adicionado na lista");
            System.out.println("Notificando as threads que estão em espera");
            conditionLock1.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void fecharLista() {
        System.out.println("Notificando todas as Threads e fechando a lista");
        aberta = false;
        lock.lock();
        try{
            conditionLock1.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public boolean isAberta() {
        return aberta;
    }
}
