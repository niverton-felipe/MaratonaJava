package abc.com.br.javacore.jdbc.classes;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

public class MyRowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent rowSetEvent) {
        System.out.println("Quando o comando execute() é utilizado");
    }

    @Override
    public void rowChanged(RowSetEvent rowSetEvent) {
        System.out.println("Quando uma linha é inserida, ativada ou deletada");
        if (rowSetEvent.getSource() instanceof RowSet){
            try {
                ((RowSet) rowSetEvent.getSource()).execute();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent rowSetEvent) {
        System.out.println("Quando o cursor é movido");
    }
}
