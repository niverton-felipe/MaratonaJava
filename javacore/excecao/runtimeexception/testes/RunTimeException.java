package abc.com.br.javacore.excecao.runtimeexception.testes;

public class RunTimeException {
    public static void main(String[] args) {
        // Arithmetic Exception
        //int a = 10 / 0;
        //System.out.println(a);
        int a = 10;
        int b = 1;
        try {
            int c = a / b;
            System.out.println(c);
        }catch(ArithmeticException error){
            error.printStackTrace();
            System.out.println("Erro");
        }

        // Null Pointer Exception
        // acontece quando método de instância é evocado sem um objeto
        //ter sido instanciado.
        Object o = null;
        try{
            System.out.println(o.toString());
        }catch(NullPointerException error){
            error.printStackTrace();
        }

    }
}
