package abc.com.br.javacore.file;

import java.io.*;

public class StreamsTest {
    public static void main(String[] args) {
    // Stream => fluxo constante de dados
    // Players de vídeos ou músicas = executam um conteúdo enquanto está recebendo dados
    // Download de arquivos => arquivo só ficará disponível após conclusão do download
    // InputStrem => leitura de dados
    //OutputStream => escrita de dados
        gravadorTunado();
        leitorTunado();
    }

    public static void gravador(){
        byte[] dados = {65,69,75,68,70};
        try(FileOutputStream gravador = new FileOutputStream("pasta/gravador.txt")){
            gravador.write(dados);
            gravador.flush();
            System.out.println("Dados gravados com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //classes bufferizadas possuem mais performance
    public static void gravadorTunado(){
        byte[] dados = {65,69,75,68,70};
        try(BufferedOutputStream gravador = new BufferedOutputStream(new FileOutputStream("pasta/gravadortunado.txt"),4096)) {
            gravador.write(dados);
            //método flush força o canal a ler todos os dados antes de fechar
            gravador.flush();
            System.out.println("Dados gravados com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void leitor(){
        try(FileInputStream leitor = new FileInputStream("pasta/gravador.txt")){
            int leitura;
            while((leitura = leitor.read()) != -1){
                byte b  = (byte) leitura;
                System.out.print(b+" ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void leitorTunado(){
        try(BufferedInputStream leitor = new BufferedInputStream(new FileInputStream("pasta/gravadortunado.txt"))) {
            int leitura;
            while((leitura = leitor.read()) != -1){
                byte b  = (byte) leitura;
                System.out.print(b+" ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
