package abc.com.br.javacore.introducaometodos.testes;

import abc.com.br.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        //valores passados dentro dos parênteses são chamados de argumentos.
        Calculadora.multiplicaDoisNumeros(55.5,5);
        double resultadoDivisao = Calculadora.divideDoisValores(20, 0);
        System.out.println("O resultado da divisão é " + resultadoDivisao);
        Calculadora.imprimeDoisNumerosDivididos(20, 4);
        Calculadora.somaVarArgs(1,2,3,4,5);

    }
}
