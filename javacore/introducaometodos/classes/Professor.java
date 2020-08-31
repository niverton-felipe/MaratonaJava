package abc.com.br.javacore.introducaometodos.classes;
/*Atributos =: nome, matricula, cpf e rg*/
public class Professor {
    public String nome;
    public String matricula;
    public String cpf;
    public String rg;

    /*Uso do this elimina a necessidade de usar params,além de deixar
    * método com os atributos específicos do objeto que foi instanciado.*/
    public void imprime(){
        System.out.println("===================");
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}
