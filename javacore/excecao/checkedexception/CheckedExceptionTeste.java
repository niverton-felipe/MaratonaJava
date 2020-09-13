package abc.com.br.javacore.excecao.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) {
       abrirArquivo();
    }

    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");
        try{
            System.out.println("Arquivo criado? "+file.createNewFile());
            System.out.println("Arquivo criado");
        }catch (IOException error){
            //Só poderemos usar argumento do tipo IOException
            //quando tiver no corpo do try algum método que possa gerar uma exception do tipo checked
            error.printStackTrace();
            throw error;
        }

    }

    public static void abrirArquivo() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Lendo arquivo");
            System.out.println("Alterando arquivo");
        }catch (Exception error){
            error.printStackTrace();
        }
        finally {
            System.out.println("Fechando arquivo");
        }

    }
}
