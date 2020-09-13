package abc.com.br.javacore.excecao.runtimeexception.testes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptions {
    public static void main(String[] args) {
        try{
            talvezLanceException();
        }catch (Exception error){
            System.out.println(error);
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }
}
