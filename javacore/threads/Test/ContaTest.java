package abc.com.br.javacore.threads.Test;

import abc.com.br.javacore.threads.classes.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void imprime(){
        synchronized (ContaTest.class){
            System.out.println("aaaaaaaa");
        }
    }

    private synchronized void saque(int valor){
        if (conta.getSaldo() >= valor){
            System.out.println(Thread.currentThread().getName() + " está indo sacar");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " completou o saque. Saldo atual: R$ " + conta.getSaldo());
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Saldo insuficiente ( R$ " + conta.getSaldo() + " )" );
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            saque(10);
            if (conta.getSaldo() < 0){
                System.out.println("Oh, meu Deus");
            }
        }
    }

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread william = new Thread(contaTest, "William");
        Thread anna = new Thread(contaTest, "Anna");
        william.start();
        anna.start();
    }
}
