package abc.com.br.javacore.classesinternas.testes;

public class ClassesLocaisTeste {
    private String nome = "Níverton";

    public void fazAlgumaCoisa(){
        //  classes interna só podem chamar variáveis do tipo final ou efetivamente final
        // os modificadores de acesso permitidos são final ou abstract
        class Interna{
            public void imprimeNome(){
                System.out.println(nome);
            }
        }
        // única maneira de usar classe interna dentro de um método é a instanciado dentro do próprio método
        //onde esta foi inserida.
        Interna in = new Interna();
        in.imprimeNome();
    }

    public static void main(String[] args) {
        ClassesLocaisTeste externa = new ClassesLocaisTeste();
        externa.fazAlgumaCoisa();
    }
}
