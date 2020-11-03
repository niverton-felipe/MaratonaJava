package abc.com.br.javacore.jdbc.db;

import abc.com.br.javacore.jdbc.classes.Carro;
import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.conn.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    public static void save(Carro carro){
        String sql = "INSERT INTO `AGENCIA`.`Carro`(`NOME`, `PLACA`, `ID_COMPRADOR`) VALUES (?,?,?)";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3,carro.getComprador().getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso\n");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(Carro carro){
        if (carro != null && carro.getId() != null){
            String sql = "DELETE FROM `AGENCIA`.`Carro` WHERE `ID` = ?";

            try (Connection conn = ConexaoFactory.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql);){
                ps.setInt(1,carro.getId());
                ps.executeUpdate();
                System.out.println("Registro deletado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void update(Carro carro){
        if (carro != null && carro.getId() != null){
            String sql = "UPDATE `AGENCIA`.`Carro` SET `PLACA` = ? ,`NOME` = ? WHERE `ID` = ?";
            try (Connection conn = ConexaoFactory.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql);){
                ps.setString(1,carro.getPlaca());
                ps.setString(2, carro.getNome());
                ps.setInt(3, carro.getId());
                ps.executeUpdate();
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static List<Carro> seletctAll(){
        String sql = "SELECT ID, PLACA, NOME, ID_COMPRADOR FROM AGENCIA.Carro";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet resultSet =  ps.executeQuery(sql);){
            while(resultSet.next()){
                Comprador comprador = CarroDAO.searchById(resultSet.getInt(4));
                carroList.add(new Carro(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), comprador ));
            }
            return  carroList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<Carro> searchByName(String nome){
        String sql = "SELECT ID, PLACA, NOME, ID_COMPRADOR FROM AGENCIA.Carro WHERE NOME LIKE ?";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, "%" + nome + "%");
            ResultSet resultSet =  ps.executeQuery();
            while(resultSet.next()){
                Comprador comprador = CarroDAO.searchById(resultSet.getInt(4));
                carroList.add(new Carro(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), comprador));
            }
            ConexaoFactory.close(conn, ps, resultSet);
            return  carroList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static Comprador searchById(int id){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR WHERE ID = ?";
        Comprador comprador = null;
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setInt(1, id);
            ResultSet resultSet =  ps.executeQuery();
            if (resultSet.next()){
               comprador = new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            }
            ConexaoFactory.close(conn, ps, resultSet);
            return  comprador;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
