package abc.com.br.javacore.file;

import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTeste extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Teste*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMasterTeste {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/arquivo2.bkp");
        Path path2 = Paths.get("arquivo2.bkp");
        Path path3 = Paths.get("william");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("-------------------");
        matches(path1,"glob:*.bkp"); // não considera separadores de diretório (\\ ou /)
        matches(path1,"glob:**/*.bkp"); // inserção de ** considera outros diretórios
        matches(path1,"glob:*"); // não considera separadores de diretório (\\ ou /)
        matches(path1,"glob:**"); // inserção de ** considera outros diretórios
        System.out.println("-------------------");
        matches(path1,"glob:*.???"); // uso da ? seguido da quantidade de repetições indicam a quantidade de caracteres que estamos procurando
        matches(path1,"glob:**/*.???");
        matches(path1,"glob:**.???");
        System.out.println("-------------------");
        matches(path3,"glob:{william*,suane*}"); // uso de colchetes indica que poderemos ter um valor ou outro
        matches(path3,"glob:{william,suane}*"); // uso da virgula indica a seperação dos valores procurados
        matches(path3,"glob:{william,suane}"); // uso do * indica que será considerado outros caracteres além da string
        Files.walkFileTree(Paths.get("./"), new FindAllTeste());
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+": " +matcher.matches(path));
    }
}
