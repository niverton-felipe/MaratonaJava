package abc.com.br.javacore.ClassesAbstratas.testes;

import abc.com.br.javacore.ClassesAbstratas.classes.Funcionario;
import abc.com.br.javacore.ClassesAbstratas.classes.Gerente;
import abc.com.br.javacore.ClassesAbstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Bolivar", "124569-8", 10000);
        Vendedor vendedor = new Vendedor("Camila", "1245658-4", 2000, 100000);
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}
