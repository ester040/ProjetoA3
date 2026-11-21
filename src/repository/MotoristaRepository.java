package repository;

import java.util.ArrayList;
import java.util.List;
import model.Multa;

import model.Motorista;

public class MotoristaRepository {

    private static List<Motorista> repositorioMotorista = new ArrayList<>();

    public MotoristaRepository() {
    }

    public void cadastrarMotorista(Motorista motorista) {
        repositorioMotorista.add(motorista);
    }

    public Motorista acharMotorista(String cpf) {

        for (Motorista motorista : repositorioMotorista) {
            if (motorista.getCpf().equals(cpf)) {
                return motorista;
            }
        }
        System.out.println("Este motorista não está cadastrado.");
        return null;
    }

    public void apagarMotorista(String cpf) {
        repositorioMotorista.remove(acharMotorista(cpf));
    }

    public void editarMotorista(Motorista motoristab, String cpf) {

        repositorioMotorista.set(repositorioMotorista.indexOf(acharMotorista(cpf)), motoristab);

    }

    public void aplicarMulta(String cpf, Multa multa) {

        Motorista motorista = acharMotorista(cpf);

        motorista.adicionarMulta(multa);

    }

}
