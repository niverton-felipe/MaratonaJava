package abc.com.br.javacore.Poliformismo.classes;

public class RelatorioPagamento {

    // Quantidade de linhas que é economizada com o poliformismo
//    public void relatorioPagamentoGerente(Gerente gerente){
//        String saida = "Relatório de pagamento gerencial \n";
//        saida += "Nome: " + gerente.getNome() + "\n";
//        saida += "Salário: R$ " + gerente.calcularPagamento() + "\n";
//        System.out.println(saida);;
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        String saida = "Relatório de pagamento para vendedores \n";
//        saida += "Nome: " + vendedor.getNome() + "\n";
//        saida += "Salário: R$ " + vendedor.calcularPagamento() + "\n";
//        System.out.println(saida);
//    }

    public void relatorioPagamentoFuncionario(Funcionario funcionario){
        String saida = "Relatório de pagamento para funcionários \n";
        saida += "Nome: " + funcionario.getNome() + "\n";
        saida += "Salário: R$ " + funcionario.calcularPagamento() + "\n";
        if (funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            saida += "Participação nos lucros: R$ " + gerente.getPnl() + "\n";
        } else if (funcionario instanceof Vendedor){
           //((Vendedor) funcionario) é um cast explícito => utilizado para reduzir tamanho do código
           saida += "Total de vendas realizadas: R$" + ((Vendedor) funcionario).getTotalVendas() + "\n";
        }
        System.out.println(saida);
    }


}
