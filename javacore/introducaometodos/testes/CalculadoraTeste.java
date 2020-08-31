package abc.com.br.javacore.introducaometodos.testes;

import abc.com.br.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        //valores passados dentro dos parênteses são chamados de argumentos.
        calc.multiplicaDoisNumeros(55.5,5);
        double resultadoDivisao = calc.divideDoisValores(20, 0);
        System.out.println("O resultado da divisão é " + resultadoDivisao);
        calc.imprimeDoisNumerosDivididos(20, 4);
        calc.somaVarArgs(1,2,3,4,5);

    }
}
