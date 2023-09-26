package candidatura.utils;

import candidatura.model.Candidato;

import java.util.ArrayList;
import java.util.List;

public class SelecaoCandidatos {
    public static List<Candidato> selecao(List<Candidato> candidatosAnalisados) {
        List<Candidato> candidatosSelecionados = new ArrayList<>();
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados.size() < 5 && candidatoAtual < candidatosAnalisados.size()) {
            Candidato candidato = candidatosAnalisados.get(candidatoAtual);

            if (salarioBase >= candidato.getSalarioPretendido()) {
                candidatosSelecionados.add(candidato);
            }
            candidatoAtual++;
        }

        return candidatosSelecionados;
    }
}
