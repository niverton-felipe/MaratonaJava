package abc.com.br.javacore.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try {
            System.out.println(file.createNewFile());
            System.out.println("Arquivo tem permissão de leitura: " + file.canRead());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("É diretório? " + file.isDirectory());
            System.out.println("Hidden? " + file.isHidden());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deletado: " + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
