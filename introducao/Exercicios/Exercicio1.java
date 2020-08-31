package abc.com.br.introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        // comando para que o valor que separa o decimal seja um "."
        entrada.useLocale(Locale.US);
        float valor1 = entrada.nextFloat();
        float valor2 = entrada.nextFloat();
        if (valor1 > valor2) {
            System.out.println("O valor 1 é maior do que o valor 2");
        }else if (valor1 == valor2){
            System.out.println("Os valores são iguais");
        }else{
            System.out.println("O valor 2 é maior do que o valor 1");
        }
    }
}
