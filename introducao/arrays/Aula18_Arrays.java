package abc.com.br.introducao.arrays;

public class Aula18_Arrays {
    public static void main(String[] args){
        // Array é um dado do tipo reference
        // tamanho do array é estático
        // pode reservar um conjunto de espaços na memória
        // cada dado é armazenado em um dos espaços de memória reservados para o array
        //a função é apenas referenciar esses espaços que foram reservados para si.
        // cada espaço do conjunto destinado ao array recebe o valor default do tipo de dado que foi definido.
        // Logo, case não defina o valor de idades[0], o seu valor default serrá zero por se tratar do tipo int.
        // valores padrões
        // byte, short, int, long, float, double = 0

        // boolean = false
        //reference = null

        int[] idades = new int[3]; //sintaxe aconselhável
        // array deve ser instanciado com tipo e size.
        // array sempre será um objeto em Java
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;

        System.out.println("idade 1: " + idades[0]);
        System.out.println("idade 2: " + idades[1]);
        System.out.println("idade 3: " + idades[2]);
    }
}
