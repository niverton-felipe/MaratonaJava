package abc.com.br.javacore.generics.teste;

import abc.com.br.javacore.generics.classes.Carro;
import abc.com.br.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("Celta"));
        ObjetosAlugaveis<Carro> carrosAlugaveis = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carroAlugado = carrosAlugaveis.getObjetoDisponivel();
        System.out.println("Objeto usado por um mês");
        carrosAlugaveis.devolverObjeto(carroAlugado);
        System.out.println("--------------------------------------------");
        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Lenovo"));
        computadoresDisponiveis.add(new Computador("Dell"));
        ObjetosAlugaveis<Computador> computadoresAlugaveis = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computadorAlugado = computadoresAlugaveis.getObjetoDisponivel();
        System.out.println("Objeto utilizado por um mês");
        computadoresAlugaveis.devolverObjeto(computadorAlugado);
    }
}

// <T> : type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    // Alugar
    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " +t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t){
        System.out.println("Devolver objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    }
}
