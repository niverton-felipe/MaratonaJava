package abc.com.br.javacore.Poliformismo.testes;

import abc.com.br.javacore.Poliformismo.classes.ArquivoDaoImpl;
import abc.com.br.javacore.Poliformismo.classes.DataBaseDAO;
import abc.com.br.javacore.Poliformismo.classes.GenericDAO;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DataBaseDAO();
        GenericDAO arquivoDAO1 = new ArquivoDaoImpl();
        arquivoDAO.save();
        arquivoDAO1.save();
    }
}
