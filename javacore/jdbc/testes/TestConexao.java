package abc.com.br.javacore.jdbc.testes;

import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.db.CompradorDBOLD;

import java.util.List;

public class TestConexao {
    public static void main(String[] args) {
//        List<Comprador> compradorList =  selecionarTudo();
//        System.out.println(compradorList);
//        List<Comprador> compradorList2 =  pesquisarPorNome("Thay");
//        System.out.println(compradorList2);
//        CompradorDB.selectMetaData();
         //CompradorDB.testTypeScroll();
        // "ao' or 'X'='X" => SQL Injection para retirar clausulas where de um select
        //System.out.println(CompradorDB.searchByNameCallableStatment("Maria"));
        //CompradorDB.updateRowSet(new Comprador(6,"09845687987", "Noilton de Sousa"));
        //System.out.println(CompradorDB.searchByNameRowset("Niverton"));
        //CompradorDB.updateRowSetCached(new Comprador(6,"09845687987", "Noilton de Sousa"));
//        try {
//            CompradorDBOLD.saveTransaction();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    public static void inserir(){
        Comprador comprador = new Comprador("954898454987", "Niverton");
        CompradorDBOLD.save(comprador);
    }

    public static void deletar(){
        Comprador comprador = new Comprador(2, "954898454987", "Niverton Felipe");
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar(){
        Comprador comprador = new Comprador(3, "954898454987", "Niverton Felipe");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo(){
        return CompradorDBOLD.seletctAll();
    }

    public static List<Comprador> pesquisarPorNome(String nome){
        return CompradorDBOLD.searchByName(nome);
    }
}
