package abc.com.br.introducao.EstruturasCondicionais;

public class Aula15_ControleDeFluxo {
    public static void main(String[] args) {
        int count = 1;
        // executa a condição somente se o teste lógica retornar verdadeiro
        while (count < 10) {
            System.out.println(count++);
        }

        /*
        * No Do While independente do teste lógico retornar verdadeiro,
        * a condição é executada ao menos uma vez.
        * */

        do {
            System.out.println("testando o do while");
        }
        while (count < 2);
        //Testando o break dentro do laço for
        for (int i = 0; i < 10; i++){
            System.out.println("O valor de i é: " + i);
            if (i == 5){
                break;
            }
        }
    }
}