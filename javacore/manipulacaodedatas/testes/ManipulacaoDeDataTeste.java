package abc.com.br.javacore.manipulacaodedatas.testes;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDataTeste {
    public static void main(String[] args) {
       Calendar c = Calendar.getInstance();
       System.out.println(c);
       if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
           System.out.println("Domingo é o primeiro dia da semana");
       }
       System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
       System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
       System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
       //Adicionando horas
       c.add(Calendar.HOUR, 3);
       Date data = c.getTime();
       System.out.println("Data e hora:" + data);
       // o método roll também adiciona as horas, mas nunca trabalha com datas diferentes (não vira o dia, mês ou ano)
       c.roll(Calendar.HOUR, 24);
       Date data2 = c.getTime();
       System.out.println("Data e hora: " + data2);

    }
}
