package abc.com.br.javacore.threads.classes;

public class Entregador implements Runnable {
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " começando o trabalho de entrega");
        int getPendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while (aberta || getPendente > 0){
            String email = listaMembros.obterEmailMembro();
            try{
                if (email != null){
                    System.out.println(nomeThread + " enviando e-mail para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluído com sucesso!");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            getPendente = listaMembros.getEmailsPendentes();
        }
        System.out.println("Trabalho finalizado");
    }
}
