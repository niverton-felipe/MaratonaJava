package abc.com.br.javacore.StringBuilder.teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String p = "Uma string qualquer";
        // StringBuilder possui tamanho fixo qe é indicado como argumento no construtor.
        StringBuilder sb = new StringBuilder(100);
        //método para adicionar um valor poara a stringBuilder
        sb.append("Uma frase qualquer");
        //StringBuilder possui método toString que permite que o seu obeto seja
        //impresso como uma string comum
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,4));
        System.out.println(sb.insert(3, "####"));
    }
}
