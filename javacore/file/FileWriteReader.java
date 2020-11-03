package abc.com.br.javacore.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReader {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (FileWriter fw = new FileWriter(file); // ao adicionar o parametro true, adicionamos mensagens no arquivo ao invés de sobrescrevê-lo)
             FileReader fr = new FileReader(file))
            {
                fw.write("Escrevendo primeira linha no texto.\nAdicionando quebra de linha");
                fw.flush(); // garante que todas as alterações foram feitas
                char[] input = new char[500];
                int size = fr.read(input);
                System.out.println(size);
                for (char c : input) {
                    System.out.print(c);
                }
        }catch(IOException error){
            error.printStackTrace();
        }

    }
}
