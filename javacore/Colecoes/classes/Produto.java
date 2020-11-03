package abc.com.br.javacore.Colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private Long serialNumber;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){

    }

    public Produto(Long serialNumber, String nome, double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(long serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return serialNumber == produto.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString(){
        String saida = "Número de série: " + serialNumber +"\n";
        saida += "Nome: " + nome +"\n";
        saida += "Preço: R$" + preco +"\n";
        saida += "Quantidade: " + quantidade +"\n";
        return saida;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.serialNumber.compareTo(outroProduto.getSerialNumber());
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
