package abc.com.br.javacore.strings.testes;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Níverton";
        nome.concat(" Felipe");
        System.out.println(nome);
        String teste = "Goku";
        String nome2 = "   goku  ";
        System.out.println(nome.charAt(2));
        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));
        System.out.println(nome2.length());
        System.out.println(nome2.replace('o', 'a'));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,3));
        System.out.println((nome2.trim()).length()); // remove espaços da string
    }
}
