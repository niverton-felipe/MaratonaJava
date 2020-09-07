package abc.com.br.javacore.Fmodificadormetodos.testes;
import abc.com.br.javacore.Fmodificadormetodos.classes.Cliente;
import com.sun.security.ntlm.Client;

public class ClienteTeste {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("Quantidade de parcelas: " + Cliente.getParcelas().length);
//        for (int parcela : cliente.getParcelas()){
//            System.out.print(parcela + " ");
//        }

    }
}
