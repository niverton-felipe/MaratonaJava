package abc.com.br.javacore.strings.testes;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Total: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Total com String Builder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Total com String Buffer: " + (fim - inicio) + " ms");
    }

    private static void concatString(int tam){
        String string = "";
        for (int i = 0; i < tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder string = new StringBuilder(tam);
        for (int i =0; i < tam; i++){
            string.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer string = new StringBuffer(tam);
        for (int i =0; i < tam; i++){
            string.append(i);
        }
    }
}
