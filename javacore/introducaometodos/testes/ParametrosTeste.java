package abc.com.br.javacore.introducaometodos.testes;

import abc.com.br.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2= 10;
        calc.modificaDoisNumeros(num1, num2);
        /*Valores das variáveis do tipo primitivo continuam os mesmos,
        * pois o JAVA passa apenas a cópia do valor do argumento*/
        System.out.println("Fora da função");
        System.out.println(num1);
        System.out.println(num2);

    }
}
