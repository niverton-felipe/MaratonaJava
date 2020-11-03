package abc.com.br.javacore.file;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {

    public static void main(String[] args) throws IOException {
        File folder = new File("folder");
        boolean mkdir = folder.mkdir();
        System.out.println("Diretório criado: " + mkdir);
        File file = new File(folder,"arquivo.txt");
        boolean newFile = file.createNewFile();
        System.out.println("Arquivo criado? " + newFile);
        File fileRenamed = new File(folder, "arquivo_renomeado.txt");
        boolean renamed = file.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? " + renamed);
        File folder2 = new File("folder_2");
        boolean folderRename = folder.renameTo(folder2);
        System.out.println("Diretório renomeado: " + folderRename);
        searchFile();
    }

    public static void searchFile(){
        File file = new File("folder_2");
        String[] list = file.list();
        for (String arq : list){
            System.out.println(arq);
        }
    }
}
