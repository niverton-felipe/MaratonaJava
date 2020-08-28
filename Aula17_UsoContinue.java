public class Aula17_UsoContinue {
    public static void main(String[] Args){
        //Dado um valor de um carro descreva a simulação da parcela
        // Programa será encerrado quando a parcela for inferior a 1000 reais
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
                // uso do continue faz código retornar ao ponto em que lógica do laço de repetição foi definido.
            }
            System.out.println(parcela + " x " + valorParcela);
        }
    }

}

