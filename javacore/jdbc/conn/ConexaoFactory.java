package abc.com.br.javacore.jdbc.conn;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {

    public static Connection getConnection(){
    String url = "jdbc:mysql://localhost:3306/AGENCIA?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static JdbcRowSet getRowsetConnection(){
        String url = "jdbc:mysql://localhost:3306/AGENCIA?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static CachedRowSet getRowsetConnectionCached(){
        String url = "jdbc:mysql://localhost:3306/AGENCIA?useTimezone=true&serverTimezone=UTC&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            return cachedRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn){
        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(RowSet jrs){
        try {
            if (jrs != null){
                jrs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt){
        close(conn);
        try {
            if (stmt != null){
                stmt.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt, ResultSet resultSet){
        close(conn, stmt);
        try {
            if (resultSet != null){
                resultSet.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
