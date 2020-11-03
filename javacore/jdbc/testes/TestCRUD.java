package abc.com.br.javacore.jdbc.testes;

import java.util.Scanner;

public class TestCRUD {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if(op == 0){
                System.out.println("Saindo do sistema");
                break;
            }
            else if(op == 1){
              menuComprador();
              Integer option = Integer.parseInt(teclado.nextLine());
              CompradorCRUD.executar(option);
            }
            else if(op == 2){
                menuCarro();
                Integer option = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(option);
            }
            else{
                System.out.println("Por favor digite uma opção válida");
            }
        }
    }

    private static void menu(){
        System.out.println("Selecione uma opção: ");
        System.out.println("1. Comprador");
        System.out.println("2. Carro");
        System.out.println("0. Sair");
    }

    private static void menuComprador(){
        System.out.println("Digite a opção desejada:");
        System.out.println("1. Inserir comprador");
        System.out.println("2. Atualizar comprador");
        System.out.println("3. Listar todos os compradores");
        System.out.println("4. Buscar comprador por nome");
        System.out.println("5. Deletar");
        System.out.println("9. Voltar");
    }

    private static void menuCarro(){
        System.out.println("Digite a opção desejada:");
        System.out.println("1. Inserir carro");
        System.out.println("2. Atualizar dados do carro");
        System.out.println("3. Listar todos os carro");
        System.out.println("4. Buscar carro por nome");
        System.out.println("5. Deletar");
        System.out.println("9. Voltar");
    }
}
