package abc.com.br.javacore.nio;

import com.sun.xml.internal.ws.util.StringUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativarTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("/pasta/subpasta");
        Path classe = Paths.get("/pasta/subpasta/subsubpasta/arquivo.txt");
        Path pathClasse = dir.relativize(classe);
        //relativize eliminará o caminho em comum entre
        // as duas variáveis e retornará o caminho relativo
        System.out.println(pathClasse);

        Path absolute1 = Paths.get("/pasta/subpasta");
        Path absolute2 = Paths.get("/Users/NIVERTON");
        Path absolute3 = Paths.get("/pasta/subpasta/subsubpasta/arquivo.txt");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/Funcionava.java");

        System.out.println("1: " + absolute1.relativize(absolute2));
        System.out.println("2: " + absolute2.relativize(absolute1));
        System.out.println("3: " + absolute3.relativize(absolute1));
        System.out.println("4: " + absolute1.relativize(absolute3));
        System.out.println("5: " + relative1.relativize(relative2));
        String nome = "niverton felipe pereira sousa";
        System.out.println(StringUtils.capitalize(nome));
    }
}
