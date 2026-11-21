package model;

//extends é a herança, tudo que o pai tem o filho tem

public class Carro extends Veiculo {

    private int aQuantidadedePortas;

    public Carro(String placa, String modelo, int ano, int renavam, int bQuantidadedePortas) {
        super(placa, modelo, ano, renavam);
        this.aQuantidadedePortas = bQuantidadedePortas;
    }

    public Carro() {
    }

    
}
