package abc.com.br.javacore.sobrecargametodos.testes;

import abc.com.br.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Níverton", "091.659.487-63", 2105.56, "065549-9");
        func.imprime();
    }
}
