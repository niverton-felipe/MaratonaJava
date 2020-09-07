package abc.com.br.javacore.blocodeinicializacao.classes;

public class Cliente {
    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    // Bloco de inicialização
    {
        // definindo tamanho do array e o popular com for indexado.
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    // construtor
    public Cliente(){
        System.out.println("Dentro do construtor");
    }
    // Getters e Setters
    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }

    public int[] getParcelas(){
        return this.parcelas;
    }
}
