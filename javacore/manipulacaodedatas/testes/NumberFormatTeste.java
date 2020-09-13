package abc.com.br.javacore.manipulacaodedatas.testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste {
    public static void main(String[] args) {
        float valor = 212.4567654f;
        Locale locFranca = new Locale("fr");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFranca);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFranca);

        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(valor));

        String valorString = "212,4567654";
        try{
            System.out.println(nf.parse(valorString));
            // esse método define se o parse considerará somente a parte inteira
            //do numero (em string) que for passado como parâmetro
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));
        }catch(ParseException error){
            error.printStackTrace();
        }
    }
}
