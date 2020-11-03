package abc.com.br.javacore.expressoesregulares;

public class TokenTeste {
    public static void main(String[] args) {
        // Trabalhando com tokens usando string
        // Tokens são os valores gerados a partir dos delimitadores
        //Podemos passar regexp como delimitador
        String string = "Paulo, Andre, Julio, Ana, Joana, Damiao";
        String[] token = string.split(",");
        for(String arr : token){
            System.out.println(arr.trim());
        }


    }

}
