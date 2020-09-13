package abc.com.br.javacore.manipulacaodedatas.testes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args) {
        //Localesegue o padrão ISO 639
        Locale localeItalia = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja");


        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER,23);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Data Italiana (IT): " +  df.format(c.getTime()));
        System.out.println("Data Italiano (Suiça): " + df2.format(c.getTime()));
        System.out.println("Data Indiana: " + df3.format(c.getTime()));
        System.out.println("Data Japonesa: " +df4.format(c.getTime()));

        // O argumento define em qual idioma a resposta será exibida
        // getDisoplayLanguage - informa o idioma
        System.out.println(localeItalia.getDisplayLanguage(localeJapao));
        System.out.println(localeSuica.getDisplayLanguage(localeIndia));
        System.out.println(localeIndia.getDisplayLanguage(localeIndia));
        //getDisplayCountry informa o país
        System.out.println(localeItalia.getDisplayCountry(localeJapao));
    }
}
