package abc.com.br.javacore.blocodeinicializacao.testes;

import abc.com.br.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        System.out.println("Quantidade de parcelas: ");
        for (int parcela : cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
