public class Aula13_EstruturaSwitchCase {
    public static void main(String[] args) {
        byte dia = 8;
        // valores aceitos: int, byte, short, enum e string
        switch(dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábadp");
                break;
            default:
                System.out.println("Esse valor não corresponde a nenhum dia da semana");
        }
    }
}
