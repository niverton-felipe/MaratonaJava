package abc.com.br.javacore.sobrecargaconstrutores.testes;

import abc.com.br.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("124347", "Níverton", new double[]{7,8,7}, "12/07/2020");
        estudante.imprime();
        System.out.println();
        System.out.println(estudante);
    }
}
