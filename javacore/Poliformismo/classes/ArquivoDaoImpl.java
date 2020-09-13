package abc.com.br.javacore.Poliformismo.classes;

public class ArquivoDaoImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no arquivo");
    }
}
