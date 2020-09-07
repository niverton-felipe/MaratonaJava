package abc.com.br.javacore.Enumeracao.classes;

public class Cliente {
    public enum TipoPagamento{
        A_VISTA(1, "À vista"), A_PRAZO(2, "Parcelado");
        private int tipo;
        private String nome;

        TipoPagamento(int tipo, String nome){
            this.tipo = tipo;
            this.nome = nome;
        }

        public int getTipo(){
            return this.tipo;
        }

        public String getNome(){
            return this.nome;
        }
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(){

    }
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
    this(nome, tipoCliente);
    this.tipoPagamento = tipoPagamento;
    }


    public String toString(){
        String saida = "Nome: " + nome + "\n";
        saida += "Tipo de cliente: " + tipoCliente.getNome() + "\n";
        saida += "Tipo de pagamento: " + tipoPagamento.getNome() + "\n";
        saida += "Número: " + tipoCliente.getTipo();
        return saida;
    }

    public String getNome() { return nome;}

    public void setNome(String nome) { this.nome = nome; }

    public TipoCliente getTipoCliente() { return tipoCliente; }

    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }
}
