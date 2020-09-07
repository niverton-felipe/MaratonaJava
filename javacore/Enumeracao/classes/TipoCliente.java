package abc.com.br.javacore.Enumeracao.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }
    /*Se o tipo de cliente PESSOA_FISICA for escolhida o valor tipo será 1
    * Se o tipo de cliente PESSOA_JURIDICA for escolhida o valor tipo será 2 */
    public int getTipo(){ return tipo;}
    /*Essa variável foi criada para tornar a saída em texto mais elegante*/
    public String getNome(){ return nome; }

    public String getId(){
        return "A";
    }

}
