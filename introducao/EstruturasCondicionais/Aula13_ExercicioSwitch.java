package abc.com.br.introducao.EstruturasCondicionais;

public class Aula13_ExercicioSwitch {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido. Por favor digite um número no intervalo entre 1 e 7");
        }
    }

}