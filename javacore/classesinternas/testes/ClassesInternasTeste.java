package abc.com.br.javacore.classesinternas.testes;

public class ClassesInternasTeste {

    private String nome = "Níverton Felipe";

    class Interna{
        public void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this); // referencia à classe interna
            System.out.println(ClassesInternasTeste.this); // referencia à classe externa
        }
    }


    public static void main(String[] args) {
        ClassesInternasTeste externa = new ClassesInternasTeste();
        ClassesInternasTeste.Interna in = externa.new Interna();
        ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
        in.verClasseExterna();
        in2.verClasseExterna();
    }
}

//class Externa{
//    private String nome = "Níverton Felipe";
//
//    class Interna{
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}
