public class Aula21_Arrays5 {
    public static void main(String[] args){
        // declaração de array bidimensional
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;
        // iteração com for indexado
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println("Dia: " + dias[i][j]);
            }
        }
        System.out.println("----------------------------------------------");
        //iteração com o forEach
        // primeira variavel(dia) indicará o caminho da memória onde array está salvo
        for (int[] dia : dias){
            for (int d : dia){
                System.out.println("Dia: " + d);
            }
        }


    }
}
