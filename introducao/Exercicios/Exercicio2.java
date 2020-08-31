package abc.com.br.introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        float somaNota = 0;
        for (int i = 1; i <= 3; i++){
            float nota = entrada.nextFloat();
            somaNota += nota;
        }
        float media = somaNota / 3;
        System.out.println("A média das notas digitadas é: " + media);
    }
}
