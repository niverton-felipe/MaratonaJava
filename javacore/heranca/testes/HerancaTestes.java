package abc.com.br.javacore.heranca.testes;

import abc.com.br.javacore.heranca.classes.Endereco;
import abc.com.br.javacore.heranca.classes.Funcionario;
import abc.com.br.javacore.heranca.classes.Pessoa;

public class HerancaTestes {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joyse", "09564598798");
        Endereco end = new Endereco();
        Funcionario func = new Funcionario("Augusto", "1564689448");
        end.setRua("José Fernandes Moscoso");
        end.setBairro("Serrotão");
        p.setEndereco(end);
        System.out.println(p);
        func.setEndereco(end);
        func.setSalario(3000);
        System.out.println(func);
        func.imprimeReciboPagamento();
    }
}
