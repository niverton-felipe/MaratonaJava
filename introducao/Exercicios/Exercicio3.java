package abc.com.br.introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String produto = entrada.next();
        Float preco = entrada.nextFloat();

        if (preco > 0 && preco < 100){
            System.out.println("O preço do(a) " + produto +  " com desconto de 5% é de R$ " + (preco * 0.95));
        }else if (preco < 500){
            System.out.println("O preço do(a) " + produto + "  desconto de 10% é de R$ " + (preco * 0.9));
        }else{
            System.out.println("O preco do(a) " + produto + " com desconto de 15% é de R$ " + (preco * 0.85));
        }
    }
}
