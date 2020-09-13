package abc.com.br.javacore.wrappers.testes;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class WrapperTeste {
    public static void main(String[] args) {
        Byte byteWrapper = 1;
        Short shortWrapper = 2;
        Integer intWrapper = new Integer("3");
        Long longWrapper = 4L;
        Float floatWrapper = 5f;
        Double doubleWrapper = 6D;
        Character charWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float numero1 = Float.parseFloat(valor);
        System.out.println(numero1);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('B'));
        System.out.println(Character.isLetterOrDigit('~'));
        System.out.println(Character.toUpperCase('a'));
 }
}

