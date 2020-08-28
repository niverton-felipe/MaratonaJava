public class Aula19_Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Seya";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}
