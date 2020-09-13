package abc.com.br.javacore.Poliformismo.testes;

import abc.com.br.javacore.Poliformismo.classes.Funcionario;
import abc.com.br.javacore.Poliformismo.classes.Gerente;
import abc.com.br.javacore.Poliformismo.classes.RelatorioPagamento;
import abc.com.br.javacore.Poliformismo.classes.Vendedor;

public class FuncionarioTestes {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bolivar", 10000, 2000);
        Vendedor vendedor = new Vendedor("Paula", 2000, 50000);
        // cast => superclasse está referenciando uma subclasse
        Funcionario func = gerente;
        Funcionario func2 = vendedor;

        RelatorioPagamento report = new RelatorioPagamento();
        /*Apesar do método RelatórioPagamentoFuncionario esperar um
        * argument do tipo Funcionario, o poliformismo permite que
        * ocorre uma conversão do tip gerente/vendedor para funcionário
        * similar ao que foi escrito de maneira explícita nas linhas anteriores
        * e essa conversão aponta para os atributos e métodos dos tipos passados no parâmetros
        * Ou seja, apesar de gerente ter virado "funcionário" ainda posso utilizar todos os seus
        * atributos e métodos*/
        report.relatorioPagamentoFuncionario(gerente);
        report.relatorioPagamentoFuncionario(vendedor);

    }
}
