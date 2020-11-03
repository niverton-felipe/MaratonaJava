package abc.com.br.javacore.jdbc.testes;

import abc.com.br.javacore.jdbc.classes.Carro;
import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.db.CarroDAO;

import java.util.List;
import java.util.Scanner;

public class CarroCRUD {
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
        Carro c = new Carro();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca(teclado.nextLine());
        System.out.println("Escolha um dos compradores abaixo: ");
        List<Comprador> compradorList = CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        CarroDAO.save(c);
    }

    public static void atualizar(){
        System.out.println("Escolha um dos Carroes abaixo: ");
        List<Carro> carroList = listar();
        Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Digite um novo nome ou enter para mantê-lo");
        String nome = teclado.nextLine();
        System.out.println("Digite uma nova placa ou enter para mantê-la");
        String placa = teclado.nextLine();
        if(!nome.isEmpty()){
            c.setNome(nome);
        }
        if(!placa.isEmpty()){
            c.setPlaca(placa);
        }
        CarroDAO.update(c);
    }

    public static List<Carro> listar(){
        List<Carro> carroList = CarroDAO.seletctAll();
        for(int i = 0; i < carroList.size();i++){
            Carro c = carroList.get(i);
            System.out.println("[ " + i + " ] " + c.getNome() + " " + c.getPlaca() + " " + c.getComprador().getNome());
        }
        return carroList;
    }

    public static void buscarPorNome(String nome){
        List<Carro> carroList = CarroDAO.searchByName(nome);
        for(int i = 0; i < carroList.size();i++){
            Carro c = carroList.get(i);
            System.out.println("[ " + i + " ] " + c.getNome() + " " + c.getPlaca() + " " + c.getComprador().getNome());
        }
    }

    public static void deletar(){
        System.out.println("Selecione uma das opções abaixo para fazer a remoção");
        List<Carro> CarroList = listar();
        Carro c = CarroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Tem certeza que deseja confirmar a remoção? S/N ");
        String resposta = teclado.nextLine();
        if (resposta.startsWith("s")){
            CarroDAO.delete(c);
        }
    }
}
