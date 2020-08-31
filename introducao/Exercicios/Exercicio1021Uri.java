package abc.com.br.introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1021Uri {
    public static void main (String[] args){

        // variaveis de controle de notas e moedas
        int nota100, nota50, nota20, nota10, nota5, nota2;
        int moeda100, moeda50, moeda25, moeda10, moeda5, moeda1;

        // Criação de instância do objeto de tipo Scanner para receber entrada de dadps
        Scanner myObj = new Scanner(System.in);
        // Utilização do método useLocale para utilizar a entrada de dados no padrão americano
        // Essa escolha está diretamente relacionado com o fato do exercício indicar que a separação entre cédulas e moedas é feita através do ponto ao invés de vírgula
        myObj.useLocale(Locale.US);

        //Criação de variável do tipo string para receber entrada do usuário
        String valorEntrada = myObj.nextLine();
        // Criação de array para receber valores que forem separado pelo ponto decimal
        String[] valorSeparado = valorEntrada.split("\\.");

        //Criação de variáveis do tipo int para receber os valores contidos no array ValorSeparado
        int valorNotas = Integer.parseInt(valorSeparado[0]);
        int valorMoedas = Integer.parseInt(valorSeparado[1]);

        //Criação de lógica utilizando divisão de inteiro e resto de divisão para preencher as variáveis de armazenamento de cédulas e moedas
        nota100 = valorNotas / 100;
        int restante = valorNotas % 100;
        nota50 = restante / 50;
        // Optei por encapsular a lógica do resto de divisão dentro das variáveis que armazenam a quantidade de cédulas e notas por continuar que o código ficaria mais enxuto
        nota20 = (restante %= 50) / 20;
        nota10 = (restante %= 20) / 10;
        nota5 = (restante %= 10) / 5;
        nota2 = (restante %= 5) / 2;
        moeda100 = (restante %= 2) / 1;
        moeda50 = valorMoedas / 50;

        int restanteMoedas = valorMoedas % 50;
        moeda25 = restanteMoedas / 25;
        moeda10 = (restanteMoedas %= 25) / 10;
        moeda5 = (restanteMoedas %= 10) / 5;
        moeda1 = (restanteMoedas %= 5) / 1;

        //Trecho do algoritmo dedicado a imprimir na tela a distribuição de notas e moedas a partir do valor fornecido pelo usuário.
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moedas(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");
    }
}
