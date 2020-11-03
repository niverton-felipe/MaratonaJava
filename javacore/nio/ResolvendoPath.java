package abc.com.br.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPath {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta\\subpasta");
        Path arquivo = Paths.get("subsubpasta\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        Path absolute = Paths.get("/pasta/subpasta");
        Path relative = Paths.get("subsubpasta");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(relative));
        System.out.println("3: " + relative.resolve(absolute));
        System.out.println("4: " + relative.resolve(file));
        System.out.println("5: " + file.resolve(absolute));
        System.out.println("6: " + file.resolve(relative));
    }
}
