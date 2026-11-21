package model;

public class Multa {

    private String data;
    private String hora;
    private String endereco;
    private String valor;
    private String especificacao;
    private String gravidade;
    private String AIT;

    public String getAIT() {
        return AIT;
    }

    public void setAIT(String aIT) {
        AIT = aIT;
    }

    //fazendo um construtor para instancear o objeto multa.
    public Multa(String data, String hora, String endereco, String valor, String especificacao, String gravidade, String AIT) {
        this.data = data;
        this.hora = hora;
        this.endereco = endereco;
        this.valor = valor;
        this.especificacao = especificacao;
        this.gravidade = gravidade;
        this.AIT = AIT;
    }

    public Multa(){}


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }


    

}
