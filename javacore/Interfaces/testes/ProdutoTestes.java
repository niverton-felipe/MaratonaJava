package abc.com.br.javacore.Interfaces.testes;

import abc.com.br.javacore.Interfaces.classes.Produto;

public class ProdutoTestes {
    public static void main(String[] args) {
        Produto prod = new Produto("notebook", 4, 2000);
        System.out.println(prod);
    }
}
