package abc.com.br.javacore.sobrescrita.testes;

import abc.com.br.javacore.sobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Paolo");
        pessoa.setIdade(25);
        System.out.println(pessoa);

    }
}
