package abc.com.br.javacore.generics.teste;

import abc.com.br.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell");
        List<Computador> computadorList = criarArray(computador);
        System.out.println(computadorList);
    }

    // Pode ser usado o T para deixar o tipo genérico, ou usar o extends para limitar
    // o conjunto de superclasse e subclasses que poderão ser utilizados no parametro
    public static <T> List<T> criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }
}

