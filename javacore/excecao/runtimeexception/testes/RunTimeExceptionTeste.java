package abc.com.br.javacore.excecao.runtimeexception.testes;

public class RunTimeExceptionTeste {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        } catch(RuntimeException error){
            //o método getMessage captura a string que foi passada
            // dentro do construtor de IllegalArgumentException
            System.out.println(error.getMessage());
            error.printStackTrace();
        }
        System.out.println("Chegou aqui");

    }

    public static void divisao(int number1, int number2){
        if(number2 == 0){
            throw new IllegalArgumentException("Não é permitido usar o 0 como número divisor. ");
        }
        int result = number1 / number2;
        System.out.println(result);
    }
}


