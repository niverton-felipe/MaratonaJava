package abc.com.br.introducaoclasses.testes;

import abc.com.br.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula ="1212";
        joao.idade = 30;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);;
    }
}
