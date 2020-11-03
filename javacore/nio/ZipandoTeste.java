package abc.com.br.javacore.nio;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTeste {
    public static void main(String[] args) {
        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        Path zipFile = dirZip.resolve("arquivo.zip");
        try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
            DirectoryStream <Path> stream = Files.newDirectoryStream(dirFiles)){
            for (Path path : stream){
                ZipEntry zipEntry = new ZipEntry(path.toFile().toString());
                zip.putNextEntry(zipEntry);
                FileInputStream fileInputStream = new FileInputStream(path.toFile());
                BufferedInputStream bf = new BufferedInputStream(fileInputStream);
                byte[] buff = new byte[2048];
                int byteRead;
                while((byteRead = bf.read(buff)) > 0){
                    zip.write(buff,0,byteRead);
                }
                zip.flush();
                zip.closeEntry();
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
