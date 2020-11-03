package abc.com.br.javacore.file;

import java.io.*;

public class BufferedTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file)))// ao adicionar o parametro true, adicionamos mensagens no arquivo ao invés de sobrescrevê-lo)
        {
            bw.write("Escrevendo primeira linha no texto.");
            bw.newLine();
            bw.write("Adicionando quebra de linha");
            bw.flush(); // garante que todas as alterações foram feitas

            String s = null;
            while ( (s = br.readLine()) != null){
                System.out.println(s);
            }

        }catch(IOException error){
            error.printStackTrace();
        }
    }
}