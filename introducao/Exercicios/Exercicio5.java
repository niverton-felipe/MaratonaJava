package abc.com.br.introducao.Exercicios;

import java.util.Scanner;
/*
* Escreva um programa que receba como entrada 25 números e exiba a
* quantidade de números que são pares e positivos.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        int countParesPositivos = contarParesPositivos();
        informarParesPositivos(countParesPositivos);
    }

    public static int contarParesPositivos(){
        Scanner entrada = new Scanner(System.in);
        int countParesPositivos = 0;
        for (int i = 0; i < 25; i++){
            int numeroEntrada = entrada.nextInt();
            if (numeroEntrada % 2 == 0 && numeroEntrada > 0) {
                countParesPositivos += 1;
            }
        }
        return countParesPositivos;
    }

    public static void informarParesPositivos(int countParesPositivos){
        if (countParesPositivos > 0){
            System.out.println("Foram digitados " + countParesPositivos + " números pares e positivos.");
        }else{
            System.out.println("Não foram digitados números pares e positivos");
        }
    }
}
