package abc.com.br.javacore.jdbc.classes;

import java.util.Objects;

public class Comprador {
    private Integer id;
    private String cpf;
    private String nome;

    public Comprador(){

    }

    public Comprador(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador(Integer id, String cpf, String nome){
        this(cpf,nome);
        this.id = id;
    }

    @Override
    public String toString(){
        String output = "ID: " + this.getId() + "\n";
        output += "CPF: " + this.getCpf() + "\n";
        output += "NOME: " + this.getNome() + "\n";
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comprador comprador = (Comprador) o;
        return Objects.equals(id, comprador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
