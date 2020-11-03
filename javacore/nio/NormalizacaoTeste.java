package abc.com.br.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTeste {
    public static void main(String[] args) {
        String diretorioTeste = "pasta\\subpasta\\subsubpasta";
        String arquivoTxt = "..\\..\\arquivo.txt";
        Path p1 = Paths.get(diretorioTeste, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("pasta\\.\\subpasta\\.\\subsubpasta");
        System.out.println(p2);
        System.out.println(p2.normalize());

    }
}
