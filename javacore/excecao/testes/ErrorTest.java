package abc.com.br.javacore.excecao.testes;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverFlowError();
    }

    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}
