public class Aula10_EstruturasCondicionais {
    public static void main(String[] Args){
        /* Regra de négocio
        * Idade < 15 categoria infantil
        * Idade >= 15 && idade < 18 categoria juvenil
        * Idade >= 18 categoria adulta
         */
        int idade = 16;
        String categoria;

        if (idade < 15){
            categoria = "infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else {
            categoria = "adulto";
        }

        System.out.println("Categoria: " + categoria);
    }
}
