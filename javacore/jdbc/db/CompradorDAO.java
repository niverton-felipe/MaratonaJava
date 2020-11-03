package abc.com.br.javacore.jdbc.db;

import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.conn.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAO {
    public static void save(Comprador comprador){
        String sql = "INSERT INTO `AGENCIA`.`COMPRADOR`(`CPF`, `NOME`) VALUES (?,?)";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso\n");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            String sql = "DELETE FROM `AGENCIA`.`COMPRADOR` WHERE `ID` = ?";

            try (Connection conn = ConexaoFactory.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql);){
                ps.setInt(1,comprador.getId());
                ps.executeUpdate();
                System.out.println("Registro deletado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void update(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            String sql = "UPDATE `AGENCIA`.`COMPRADOR` SET `CPF` = ? ,`NOME` = ? WHERE `ID` = ?";
            try (Connection conn = ConexaoFactory.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql);){
                ps.setString(1,comprador.getCpf());
                ps.setString(2, comprador.getNome());
                ps.setInt(3, comprador.getId());
                ps.executeUpdate();
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static List<Comprador> seletctAll(){
        String sql = "SELECT ID, CPF, NOME FROM AGENCIA.COMPRADOR";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet resultSet =  ps.executeQuery(sql);){
            while(resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR WHERE NOME LIKE ?";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, "%" + nome + "%");
            ResultSet resultSet =  ps.executeQuery();
            while(resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            ConexaoFactory.close(conn, ps, resultSet);
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
