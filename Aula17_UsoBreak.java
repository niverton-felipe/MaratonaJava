public class Aula17_UsoBreak {
    public static void main(String[] Args){
        //Dado um valor de um carro descreva a simulação da parcela
        // Programa será encerrado quando a parcela for inferior a 1000 reais
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + " x " + valorParcela );
        }
    }

}
