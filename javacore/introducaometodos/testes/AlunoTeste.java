package abc.com.br.javacore.introducaometodos.testes;
import abc.com.br.javacore.introducaometodos.classes.Estudante;

public class AlunoTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Níverton Felipe");
        estudante.setIdade(26);
        estudante.setNotas(new float[]{8,10,9});

        estudante.imprimeAluno();
        System.out.println(estudante.isAprovado());
    }
}
