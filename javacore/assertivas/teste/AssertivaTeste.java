package abc.com.br.javacore.assertivas.teste;

public class AssertivaTeste {
    public static void main(String[] args) {
        calculaSalario(100);
        diaSemana(9);
    }

    public static void calculaSalario(double salario){
        assert (salario > 0): "O salário não deve ser inferior a 0";
        // calcula salário
    }

    public static void diaSemana(int dia){
        switch (dia) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default: assert false;
        }
    }
}
