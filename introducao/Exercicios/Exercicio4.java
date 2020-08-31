package abc.com.br.introducao.Exercicios;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int maiorNumero = 0;
        int menorNumero = 0;

        if (numero1 >= numero2){
            maiorNumero = numero1;
            menorNumero = numero2;
        }else{
            maiorNumero = numero2;
            menorNumero = numero1;
        }
        int count = contarMultiplos(maiorNumero, menorNumero);
        informarMultiplos(count, maiorNumero, menorNumero);
    }

    public static int contarMultiplos(int maiorNumero, int menorNumero){
        int count = 0;
        for (int menor = (menorNumero + 1); menor < maiorNumero; menor++){
            if (menor % 4 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static void informarMultiplos(int count, int maiorNumero, int menorNumero){
        if (count > 0){
            System.out.println("Entre os números " + menorNumero +
                    " e " + maiorNumero + " há " + count + " múltiplos de 4.");
        }
        else{
            System.out.println("Não há múltiplos de 4 entre no intervalo entre " + menorNumero + " e " + maiorNumero);
        }
    }
}

