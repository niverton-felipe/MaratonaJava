package abc.com.br.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 6);
    }

    // criação de métodos com parâmetros
    public void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    // criação de método com parâmetros e retorno
    public double divideDoisValores(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possível dividir por 0");
    }

    public void modificaDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Os números foram alterados para");
        System.out.println(num1);
        System.out.println(num2);
    }

    /* utilização do varargs como parâmetro elimina a necessidade
    de passar um array, no entanto, o que ele faz por debaixo dos panos
     é transformar o parametro em array*/
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
