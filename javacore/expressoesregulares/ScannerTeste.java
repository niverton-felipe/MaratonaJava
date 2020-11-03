package abc.com.br.javacore.expressoesregulares;

import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        // Delimitador natural do objeto da classe Scanner é o espaço
        // o delimitador pode ser alterado evocando o método de instância useDelimiter()
        Scanner input = new Scanner("1 true 100 oi");

        //hasNext() faz a checaghem se há outro token após o delimitador
        while(input.hasNext()){
            System.out.println(input.next());
        }
        //next informa qual o token é gerado na posição atual
        System.out.println();
        Scanner input2 = new Scanner("1 true 100 oi");
        while(input2.hasNext()){
            if (input2.hasNextInt()){
                int number = input2.nextInt();
                System.out.println("int: " + number);
            }else if (input2.hasNextBoolean()){
                boolean b = input2.nextBoolean();
                System.out.println("boolean: " + b);
            }else{
                System.out.println("outro tipo: " + input2.next());
            }
        }

    }
}
