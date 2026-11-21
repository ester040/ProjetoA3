package model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    private String placa;
    private String modelo;
    private int ano;
    private int renavam;
    private Motorista motorista;
    

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", renavam=" + renavam
                + ", motorista=" + motorista + "]";
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getRenavam() {
        return renavam;
    }
    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Veiculo(String placa, String modelo, int ano, int renavam) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.renavam = renavam;
    }
    public Veiculo(){}
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }


    
}
