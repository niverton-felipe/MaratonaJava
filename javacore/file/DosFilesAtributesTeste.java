package abc.com.br.javacore.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAtributesTeste {
    public static void main(String[] args) {
        Path path = Paths.get("folder_2\\teste.txt");
        try {
            //Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path,"dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
