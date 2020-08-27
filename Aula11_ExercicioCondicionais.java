public class Aula11_ExercicioCondicionais {

    public static void main(String[] Args){
        /* Regra de négocio
         * Menor que 18 => Não é adulto
         * Maior ou igual a 18 => adulto
         */
        int idade = 20;
        String status;

        status = idade < 18 ? "menor de idade" : "maior de idade";

        System.out.println(status);

    }
}




