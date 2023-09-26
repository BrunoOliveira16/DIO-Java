package candidatura.utils;

import java.util.List;

import candidatura.model.Candidato;

public class ImprimeSelecionados {
    public static void imprimir(List<Candidato> candidatosSelecionados) {

        for (Candidato candidato : candidatosSelecionados) {
            System.out.println("Candidato(a) selecionado(a): " + candidato.getNome() + " - Salario pretendido R$ "
                    + candidato.getSalarioPretendido());
        }
    }
}
