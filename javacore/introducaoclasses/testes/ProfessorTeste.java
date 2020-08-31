package abc.com.br.introducaoclasses.testes;

import abc.com.br.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        // Instanciar objeto da classe professor
        Professor professor = new Professor();
        // definir os dados dos atributos do objeto professor
        professor.nome = "Eduardo Falcão";
        professor.matricula = "124347";
        professor.cpf = "4576411331";
        professor.rg = "031564";

        //Instanciando outro objeto e definindo seus atributos;
        Professor professor1 = new Professor();
        professor1.nome = "Jemerson Damásio";
        professor1.matricula = "112451";
        professor1.cpf = "001546784994";
        professor1.rg = "0214567";

        //professor = professor1;
        // linha de código acima faria objeto da esquerda referenciar o objeto da direita.
        // Impressão de valores do objeto professor
        System.out.println("Nome:" + professor.nome);
        System.out.println("Matrícula: " + professor.matricula);
        System.out.println("CPF: " + professor.cpf);
        System.out.println("RG: "+ professor.rg);
        System.out.println();
        // Impressão de valores do objeto professor1
        System.out.println("Nome:" + professor1.nome);
        System.out.println("Matrícula: " + professor1.matricula);
        System.out.println("CPF: " + professor1.cpf);
        System.out.println("RG: "+ professor1.rg);
    }
}
