package repository;

import java.util.ArrayList;
import java.util.List;

import model.Veiculo;

public class VeiculoRepository {
    // static(variavel da classe não do objeto)
    private static List<Veiculo> repositorioVeiculo = new ArrayList<>();

    public VeiculoRepository() {
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        repositorioVeiculo.add(veiculo);
    }

    public Veiculo acharVeiculo(int renavam) {

        for (Veiculo veiculo : repositorioVeiculo) {
            if (veiculo.getRenavam() == renavam) {
                return veiculo;
            }
        }
        System.out.println("Este veiculo não está cadastrado.");
        return null;
    }

    public void apagarVeiculo(int renavam) {
        repositorioVeiculo.remove(acharVeiculo(renavam));
    }

    public void editarVeiculo(Veiculo veiculob, int renavam) {

        Veiculo antiga = acharVeiculo(renavam);

        repositorioVeiculo.set(repositorioVeiculo.indexOf(antiga), veiculob);
    }

}
