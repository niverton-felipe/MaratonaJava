package abc.com.br.javacore.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioTeste {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\NIVERTON\\IdeaProjects\\JavaOnline\\folder_2\\arquivo.txt");
        Path p2 = Paths.get("C:","\\Users\\NIVERTON\\IdeaProjects\\JavaOnline\\folder_2", "arquivo.txt");
        Path p3 = Paths.get("C:\\Users\\NIVERTON\\IdeaProjects\\JavaOnline\\folder_2", "arquivo.txt");
        Path p4 = Paths.get("C:","Users","NIVERTON","IdeaProjects", "JavaOnline","folder_2", "arquivo.txt");
        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();
        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta\\arquivo.txt");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\arquivo.txt");
        try {
            //método getParente é utilizado quando se precisa considerar apenas os relatórios
            if (Files.notExists(path2.getParent())){
                // Para criar mais criar diretório com subníveis
                Files.createDirectories(path2.getParent());
            }
            if (Files.notExists(arquivo)){
                Files.createFile(arquivo);
            }
        }catch (IOException e) {
           e.printStackTrace();
        }
        Path source = Paths.get("folder_2\\arquivo.txt");
        Path target = Paths.get(path2.getParent() + "\\arquivo_copiado.txt");
        try{
            // o último parâmtro é utilizado para sobrescrever um arquivo que já existe.
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            // deletar arquivo caso ele tenha sido criado
            Files.deleteIfExists(target);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
