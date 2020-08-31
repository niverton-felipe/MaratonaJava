package abc.com.br.introducao.Exercicios;

import java.util.Scanner;

/*Escreva um programa que receba como entrada vários números,
até que seja informado o valor 100, e exiba a média dos números pares.
*/
public class Exercicio7 {
    public static void main(String[] args) {
    int mediaNumerosPares = mediaNumerosPares();
    System.out.println("-----------------------------------------------");
    System.out.println("A média dos números pares digitados é: " + mediaNumerosPares);
    }

    public static int mediaNumerosPares(){
        Scanner entrada = new Scanner(System.in);
        int entradaUsuario = 0;
        int count = 0;
        int somaNumerosPares = 0;
        while (entradaUsuario != 100){
            System.out.print("Digite um número inteiro (digite 100 para encerrar o programa): ");
            entradaUsuario = entrada.nextInt();
            if (entradaUsuario % 2 == 0 && entradaUsuario != 100){
                somaNumerosPares += entradaUsuario;
                count += 1;
            }
        }
        int mediaNumerosPares = somaNumerosPares / count;
        return  mediaNumerosPares;
    }
}
