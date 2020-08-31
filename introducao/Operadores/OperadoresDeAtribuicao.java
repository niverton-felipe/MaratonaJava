package abc.com.br.introducao.Operadores;

public class OperadoresDeAtribuicao {
    public static void main (String[] args) {
        /* Operadores de atribuição
        * =
        * -=
        * +=
        * *=
        * /=
        * */
        int salario = 1800;
        double comissao = salario * 0.1;
        salario += comissao;

        System.out.println(salario);

    }
}


