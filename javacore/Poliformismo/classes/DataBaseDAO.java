package abc.com.br.javacore.Poliformismo.classes;

public class DataBaseDAO implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
