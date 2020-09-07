package abc.com.br.javacore.associacaoclasses.Exercicio1;

public class Local {
    private String rua;
    private String bairro;
    private String cidade;

    public Local(){

    }

    public Local(String rua, String bairro, String cidade){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    //Override
    @Override
    public String toString() {
        String saida = "------------- Relatório Local -------------";
        saida += "\nRua: " + rua + "\n";
        saida += "Bairro: " + rua + "\n";
        saida += "Cidade: " + cidade + "\n";
        return saida;
    }

    // Getters e setters
    public void setRua(String rua){
        this. rua = rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getRua(){
        return this.rua;
    }

    public String getBairro(){
        return this.bairro;
    }

    public String getCidade(){
        return this.cidade;
    }
}
