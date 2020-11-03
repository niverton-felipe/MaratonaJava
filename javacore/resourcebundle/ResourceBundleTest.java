package abc.com.br.javacore.resourcebundle;

import abc.com.br.javacore.associacaoclasses.Exercicio1.Local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        //os argumentos são o primeiro nome antes da steinge e o locale
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
//        Locale locale = new Locale("fr", "CA");
//        ResourceBundle.getBundle("message", locale);

        //fluxo de tentativas do JAVA para localizar Resource Bundle
        //message_fr_CA.properties
        //message_fr.properties
        //message_pt_BR.properties
        //message_pt.properties
        //message.properties
        //lançamento de exceção
    }
}
