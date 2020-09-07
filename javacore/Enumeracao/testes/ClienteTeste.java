package abc.com.br.javacore.Enumeracao.testes;

import abc.com.br.javacore.Enumeracao.classes.Cliente;
import abc.com.br.javacore.Enumeracao.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.A_VISTA);
        System.out.println(cliente);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
    }
}
