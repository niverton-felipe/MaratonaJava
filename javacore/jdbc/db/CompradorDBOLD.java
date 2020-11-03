package abc.com.br.javacore.jdbc.db;

import abc.com.br.javacore.jdbc.classes.Comprador;
import abc.com.br.javacore.jdbc.classes.MyRowSetListener;
import abc.com.br.javacore.jdbc.conn.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDBOLD {
    public static void save(Comprador comprador){
        String sql = "INSERT INTO `AGENCIA`.`COMPRADOR`(`CPF`, `NOME`) VALUES ('" + comprador.getCpf() + "'," + "'" + comprador.getNome() + "')";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void saveTransaction() throws SQLException {
        String sql = "INSERT INTO `AGENCIA`.`COMPRADOR`(`CPF`, `NOME`) VALUES ('096458987845', 'TESTE1')";
        String sql2 = "INSERT INTO `AGENCIA`.`COMPRADOR`(`CPF`, `NOME`) VALUES ('096458987846', 'TESTE2')";
        String sql3 = "INSERT INTO `AGENCIA`.`COMPRADOR`(`CPF`, `NOME`) VALUES ('096458987849', 'TESTE3')";
        Connection conn = ConexaoFactory.getConnection();
        Savepoint savepoint = null;
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            savepoint = conn.setSavepoint("One"); // guarda a alteração1
            stmt.executeUpdate(sql2);
            if (true)
                throw new SQLException();
            stmt.executeUpdate(sql3);
            conn.commit();
            conn.setAutoCommit(true);
            System.out.println("Registro inserido com sucesso");
            ConexaoFactory.close(conn, stmt);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            conn.rollback(savepoint); // => rollback assegura que bd volte ao estado anterior já que houve erro na transação
            //passagem do savepoint garante que banco volte até o momento em que savepoint foi registrado
            conn.commit();
            //uso do commit faz a transação até o momento em que rollback fora feito
        }
    }

    public static void delete(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            String sql = "DELETE FROM `AGENCIA`.`COMPRADOR` WHERE `ID` = '" + comprador.getId() + "'";
            Connection conn = ConexaoFactory.getConnection();
            try {
                Statement stmt = conn.createStatement();
                System.out.println(stmt.executeUpdate(sql));
                ConexaoFactory.close(conn, stmt);
                System.out.println("Registro excluído com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void update(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            String sql = "UPDATE `AGENCIA`.`COMPRADOR` SET `CPF` = '" + comprador.getCpf() + "',`NOME` = '" + comprador.getNome() +  "' WHERE `ID` = '" + comprador.getId() + "'";
            Connection conn = ConexaoFactory.getConnection();
            try {
                Statement stmt = conn.createStatement();
                System.out.println(stmt.executeUpdate(sql));
                ConexaoFactory.close(conn, stmt);
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void updatePreparedStatment(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            String sql = "UPDATE `AGENCIA`.`COMPRADOR` SET `CPF` = ? ,`NOME` = ? WHERE `ID` = ?";
            Connection conn = ConexaoFactory.getConnection();
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,comprador.getCpf());
                ps.setString(2, comprador.getNome());
                ps.setInt(3, comprador.getId());
                ps.executeUpdate();
                ConexaoFactory.close(conn, ps);
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static List<Comprador> seletctAll(){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR";
        Connection conn = ConexaoFactory.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet =  stmt.executeQuery(sql);
            List<Comprador> compradorList = new ArrayList<>();
            while(resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            ConexaoFactory.close(conn, stmt, resultSet);
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR WHERE NOME LIKE '%" + nome + "%'";
        Connection conn = ConexaoFactory.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet =  stmt.executeQuery(sql);
            List<Comprador> compradorList = new ArrayList<>();
            while(resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            ConexaoFactory.close(conn, stmt, resultSet);
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void selectMetaData(){
        String sql = "SELECT * FROM AGENCIA.COMPRADOR";
        Connection conn = ConexaoFactory.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet =  stmt.executeQuery(sql);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de colunas: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++){
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho: " + rsmd.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(conn, stmt, resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void checkDriverStatus(){
        Connection conn = ConexaoFactory.getConnection();
        try{
            DatabaseMetaData dbmt = conn.getMetaData();
            if (dbmt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Suporta TYPE FORWARD ONLY");
                if(dbmt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmt.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if(dbmt.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmt.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if(dbmt.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(conn);
        }catch (SQLException error){
            error.printStackTrace();
        }
    }
    // MÉTODOS PARA POSICIONAMENTO DO CURSOR
    public static void testTypeScroll(){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR";
        Connection conn = ConexaoFactory.getConnection();
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet =  stmt.executeQuery(sql);

            if(resultSet.last()){
                System.out.println("id: " + resultSet.getString("ID") + ", CPF: " + resultSet.getString("CPF") + ", NOME: " + resultSet.getString("NOME"));
                System.out.println("Número da última linha: " + resultSet.getRow());
            }
            resultSet.first();
            System.out.println("Retornou para a primeira linha");
            System.out.println("Linha atual: " + resultSet.getRow());
            resultSet.absolute(4);
            System.out.println("Alternando para a linha 4");
            System.out.println("Linha atual: " + resultSet.getRow());
            resultSet.relative(-1);
            System.out.println("Movendo para linha anterior");
            System.out.println("Linha atual: " + resultSet.getRow());
            System.out.println(resultSet.last());
            System.out.println(resultSet.isFirst());
            //resultSet.last(); => uso do last nesse fará com que último registro seja pulado
            resultSet.afterLast();
            while (resultSet.previous()){
                System.out.println("ID: " + resultSet.getString("ID") + " CPF: " + resultSet.getString("CPF") + " NOME: " + resultSet.getString("NOME"));
            }
            ConexaoFactory.close(conn, stmt, resultSet);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void updateToLowerCase(){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR";
        Connection conn = ConexaoFactory.getConnection();
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet =  stmt.executeQuery(sql);
            //while(resultSet.next()){
               //resultSet.updateString("NOME", resultSet.getString("NOME").toLowerCase());
            //resultSet.cancelRowUpdates(); boa prática para cancelar update realizado.
            //cancelRowUpdate precisa ser executado antes do comando updateRow ou seja antes do banco ter o seu estado alterado)
            //resultSet.updateRow();
            //}
//            resultSet.absolute(2);
//            String nome = resultSet.getString("NOME");
//            resultSet.moveToInsertRow();
//            resultSet.updateString("NOME", nome.toUpperCase());
//            resultSet.updateString("CPF", "659874857-98");
//            resultSet.insertRow();
//            resultSet.moveToCurrentRow();
//            System.out.println("ID: " + resultSet.getString("ID") + " NOME: " + resultSet.getString("NOME") + " CPF: " + resultSet.getString("CPF"));
//            ConexaoFactory.close(conn, stmt, resultSet);
            resultSet.last();
            resultSet.deleteRow();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
     }

    public static List<Comprador> searchByNamePreparedStatment(String nome){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR WHERE NOME LIKE ?";
        Connection conn = ConexaoFactory.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"%"+nome+"%");
            ResultSet resultSet =  ps.executeQuery();
            List<Comprador> compradorList = new ArrayList<>();
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

    public static List<Comprador> searchByNameCallableStatment(String nome){
        String sql = "CALL `AGENCIA`.`SP_getCompradadoresPorNome`( ? )";
        Connection conn = ConexaoFactory.getConnection();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1,"%" + nome + "%");
            ResultSet resultSet =  cs.executeQuery();
            List<Comprador> compradorList = new ArrayList<>();
            while(resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            ConexaoFactory.close(conn, cs, resultSet);
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameRowset(String nome){
        String sql = "SELECT ID, NOME, CPF FROM AGENCIA.COMPRADOR WHERE NOME LIKE ?";
        JdbcRowSet jrs = ConexaoFactory.getRowsetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
            jrs.setString(1,"%"+nome+"%");
            jrs.execute();
            List<Comprador> compradorList = new ArrayList<>();
            while(jrs.next()){
                compradorList.add(new Comprador(jrs.getInt(1), jrs.getString(2), jrs.getString(3)));
            }
            ConexaoFactory.close(jrs);
            return  compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void updateRowSet(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            //String sql = "UPDATE `AGENCIA`.`COMPRADOR` SET `CPF` = ? ,`NOME` = ? WHERE `ID` = ?";
            String sql = "SELECT * FROM COMPRADOR WHERE ID = ?";
            JdbcRowSet jrs = ConexaoFactory.getRowsetConnection();
            jrs.addRowSetListener(new MyRowSetListener());
            try {
                jrs.setCommand(sql);
                //jrs.setString(1,comprador.getCpf());
                //jrs.setString(2, comprador.getNome());
                jrs.setInt(1, comprador.getId());
                jrs.execute();
                jrs.next();
                jrs.updateString("NOME", "WILLIAM DEVDOJO");
                jrs.updateRow();
                ConexaoFactory.close(jrs);
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void updateRowSetCached(Comprador comprador){
        if (comprador != null && comprador.getId() != null){
            //String sql = "UPDATE `AGENCIA`.`COMPRADOR` SET `CPF` = ? ,`NOME` = ? WHERE `ID` = ?";
            String sql = "SELECT * FROM COMPRADOR WHERE ID = ?";
            CachedRowSet crs = ConexaoFactory.getRowsetConnectionCached();
            try {
                crs.setCommand(sql);
                //crs.setString(1,comprador.getCpf());
                //crs.setString(2, comprador.getNome());
                crs.setInt(1, comprador.getId());
                crs.execute();
                crs.next();
                crs.updateString("NOME", "WWW");
                crs.updateRow();
                crs.acceptChanges();
                System.out.println("Registro atualizado com sucesso");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
