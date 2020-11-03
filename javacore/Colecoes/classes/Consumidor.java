package abc.com.br.javacore.Colecoes.classes;

import java.util.Objects;

public class Consumidor {
    private String nome;
    private String cpf;

    public Consumidor(){

    }

    public Consumidor(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString(){
        String out = "";
        out += "Nome: " +nome +"\n";
        out += "Cpf: " +cpf +"\n";
        return out;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return  this.nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
