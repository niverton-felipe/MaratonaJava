package abc.com.br.introducao.Exercicios;

import java.util.Scanner;

/*
Escreva um programa que receba como entrada 50 números e exiba a soma dos
que são múltiplos de 3
*/
public class Exercicio6 {
    public static void main(String[] args) {
        int somaMultipos = somarMultiploTres();
        System.out.println("A soma dos múltiplos de três dos números digitados é " + somaMultipos);
    }

    public static int somarMultiploTres(){
        Scanner entrada = new Scanner(System.in);
        int somaMultiplos = 0;
        for (int i = 0; i < 50; i++){
            int entradaUsuario = entrada.nextInt();
            if (entradaUsuario % 3 == 0){
                somaMultiplos += entradaUsuario;
            }
        }
        return somaMultiplos;
    }
}
