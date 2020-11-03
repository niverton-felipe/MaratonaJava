package abc.com.br.javacore.jdbc.testes;

import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class CompradorCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int option){
        switch (option){
            case 1: inserir();
                break;
            case 2: atualizar();
                break;
            case 3: listar();
                break;
            case 4:
                System.out.println("Digite o nome que será procurado: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
        }
    }

    public static void inserir(){
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
        CompradorDAO.save(c);
    }

    public static void atualizar(){
        System.out.println("Escolha um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Digite um novo nome ou enter para mantê-lo");
        String nome = teclado.nextLine();
        System.out.println("Digite um novo cpf ou enter para mantê-lo");
        String cpf = teclado.nextLine();
        if(!nome.isEmpty()){
            c.setNome(nome);
        }
        if(!cpf.isEmpty()){
            c.setCpf(cpf);
        }
        CompradorDAO.update(c);
    }

    public static List<Comprador> listar(){
        List<Comprador> compradorList = CompradorDAO.seletctAll();
        for(int i = 0; i < compradorList.size();i++){
            Comprador c = compradorList.get(i);
            System.out.println("[ " + i + " ] " + c.getNome() + " " + c.getCpf());
        }
        return compradorList;
    }

    public static void buscarPorNome(String nome){
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);
        for(int i = 0; i < compradorList.size();i++){
            Comprador c = compradorList.get(i);
            System.out.println("[ " + i + " ] " + c.getNome() + " " + c.getCpf());
        }
    }

    public static void deletar(){
        System.out.println("Selecione uma das opções abaixo para fazer a remoção");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Tem certeza que deseja confirmar a remoção? S/N ");
        String resposta = teclado.nextLine();
        if (resposta.startsWith("s")){
            CompradorDAO.delete(c);
        }
    }
}
