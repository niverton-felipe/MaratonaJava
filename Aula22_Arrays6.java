public class Aula22_Arrays6 {
    public static void main(String[] args) {
        // Os espaços na memória do array podem referenciar outros
        //arrays com diferentes sizes
        int[][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];
        // iteracao com forEach
        // Por se tratar de diferentes sizes o mais indicado é iterar com forEach
        for (int[] ref : dias){
            for (int dia : ref){
                System.out.println("Dia: " + dia);
            }
        }
    }
}
