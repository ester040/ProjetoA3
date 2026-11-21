package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {

    private String nome;
    private String cnh;
    private String cpf;
    private String rg;
    private String datanascimento;
    private List<Multa> listaMulta = new ArrayList<>();

    public Motorista(String nome, String cnh, String cpf, String rg, String datanascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.cpf = cpf;
        this.rg = rg;
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "Motorista [nome=" + nome + ", cnh=" + cnh + ", cpf=" + cpf + ", rg=" + rg + ", datanascimento="
                + datanascimento + ", listaMulta=" + listaMulta + "]";
    }

    public Motorista(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public List<Multa> getListaMulta() {
        return listaMulta;
    }

    public void adicionarMulta(Multa multa){
        listaMulta.add(multa);
    }

}
