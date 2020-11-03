package abc.com.br.javacore.Colecoes.testes;

import abc.com.br.javacore.Colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular c1 = new Celular("Galaxy S9", "2e4468a");
        Celular c2 = new Celular("Iphone", "2aa4754");
        Celular c3 = new Celular("Nokia A50", "7c5aa44");

        List<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);
        for(Celular cel : celulares){
            System.out.println(cel);
        }
        // método contains verifica se o arrayList contém o conteúdo passado no argumento
        System.out.println(celulares.contains(c3));
    }
}


