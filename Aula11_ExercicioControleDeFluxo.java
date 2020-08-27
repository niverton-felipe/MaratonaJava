public class Aula11_ExercicioControleDeFluxo {

    public static void main (String[] args){
        /* Informar o imposto baseado no salário de um funcionário
         * salario < 1000 : imposto de 5%
         * salario >= 1000 && salario < 2000 : imposto de 10%
         * salario >= 2000 && salario < 4000 : imposto de 15%
         * salario >= 4000 : imposto de 20%
         */

         double salary = 2542.28;
         double imposto ;

         if (salary < 1000) {
             imposto = salary * 0.05;
         } else if (salary >= 1000 && salary < 2000) {
             imposto = salary * 0.1;
         } else if (salary >= 2000 && salary < 4000){
             imposto = salary * 0.15;
         } else {
             imposto = salary * 0.2;
         }

        System.out.println("O salário de " + salary + "tem imposto de " + imposto);

    }

}
