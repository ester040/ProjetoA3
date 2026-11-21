package model;

public class Caminhao extends Veiculo{

    private TipoCaminhao tipoCaminhao;

    public Caminhao(String placa, String modelo, int ano, TipoCaminhao tipoCaminhao, int renavam) {
        super(placa, modelo, ano, renavam);
        this.tipoCaminhao = tipoCaminhao;
    }

    public Caminhao() {
    }

    public TipoCaminhao getTipoCaminhao() {
        return tipoCaminhao;
    }

    
}
