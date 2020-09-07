package abc.com.br.javacore.Fmodificadormetodos.classes;

public class Cliente {
    private static int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    // Bloco de inicialização
    static {
        System.out.println("Utilizando bloco de inicialização estático");
        // definindo tamanho do array e o popular com for indexado.
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    // construtor
    public Cliente(){

    }

    // Getters e Setters

    public static int[] getParcelas(){
        return Cliente.parcelas;
    }
}
