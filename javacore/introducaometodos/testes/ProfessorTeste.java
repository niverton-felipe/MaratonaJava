package abc.com.br.javacore.introducaometodos.testes;

import abc.com.br.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args){
        Professor prof = new Professor();
        prof.cpf = "094.659.484-08";
        prof.matricula = "1243487";
        prof.nome = "Eduardo Falcão";
        prof.rg = "457485-9";
        /*No método que recebe o tipo referência como parâmetro, o seu parametro fará referência para os atributos do objeto que foi passado
        como argumento.*/
        prof.imprime();
    }
}
