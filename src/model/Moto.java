package model;

public class Moto extends Veiculo{

    private int aCilindradas;

    public Moto(String placa, String modelo, int ano, int renavam, int bCilindradas) {
        super(placa, modelo, ano, renavam);
        this.aCilindradas = bCilindradas;
    }

    public Moto() {
    }

    
    
}
