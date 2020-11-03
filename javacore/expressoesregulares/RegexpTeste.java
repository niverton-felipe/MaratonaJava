package abc.com.br.javacore.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTeste {
    public static void main(String[] args) {
        /* \d => número hexadecimais são inicados por 0x (x pode ser maiúsculo ou minúsculo */
        /* quantificadores
        * ? => 0 ou 1 ocorrência
        * * => 0 ou  mais ocorrências
        * + => 1 ou mais ocorrências
        * {n, m} => de n até m ocorrências
        * . => caractere coringa. Ex: 1.3 pode ser 123, 133,153, etc
        * () => agrupar
        * | => ou
        * $ =< fim de linha
        * Exemplo de agrupamento: o(c|v)o
        * retornaria ovo ou oco*/
        int numeroHex = 0x100;
        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "04/06/2020 01/5/2020 05/04/20 ";
        System.out.println("E-mail válido: " + "baiana@mail.com.br".matches(regex) );
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("Índice: ");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas ");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
        System.out.println(numeroHex);
    }
}
