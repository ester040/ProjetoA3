package repository;

import java.util.ArrayList;
import java.util.List;

import model.Multa;

public class MultaRepository {

    private static List<Multa> repositorioMulta = new ArrayList<>();

    public MultaRepository() {
    }

    public void cadastrarMulta(Multa multa) {
        repositorioMulta.add(multa);
    }

    public Multa acharMulta(String AIT) {

        for (Multa multa : repositorioMulta) {
            if (multa.getAIT().equals(AIT)) {
                return multa;
            }
        }
        System.out.println("Esta multa não está cadastrada.");
        return null;
    }

    public void apagarMulta(String AIT) {
        repositorioMulta.remove(acharMulta(AIT));
    }

    public void editarMulta(Multa multab, String AIT) {

        Multa antiga = acharMulta(AIT);

        repositorioMulta.set(repositorioMulta.indexOf(antiga), multab);
    }

}
