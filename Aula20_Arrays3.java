public class Aula20_Arrays3 {
    public static void main(String[] args) {
        // primeira forma de criar array
        int[] numeros = new int[5];
        // segunda forma de criar array
        int[] numeros2 = {1,2,3,4,5};
        // terceira forma de criar arrays
        int[] numeros3 = new int[]{1,2,3,4,5};
        // sintaxe foreach
        for (int numero : numeros2) {
            System.out.println("número " + numero);
        }

    }
}
