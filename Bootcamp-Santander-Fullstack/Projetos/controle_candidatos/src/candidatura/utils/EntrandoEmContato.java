package candidatura.utils;

import java.util.List;

import candidatura.model.Candidato;
import candidatura.data.Ligacao;

public class EntrandoEmContato {
    public static void emContato(List<Candidato> candidatosSelecionados) {
        for (Candidato candidato : candidatosSelecionados) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = Ligacao.atender();
                continuarTentando = !atendeu;

                if (continuarTentando) {
                    tentativasRealizadas++;
                }

            } while (continuarTentando && tentativasRealizadas < 3);

            if (atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato.getNome() + " EM " + tentativasRealizadas
                        + " TENTATIVAS REALIZADAS");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato.getNome() + ", NÚMERO MAXIMO TENTATIVAS "
                        + tentativasRealizadas + " REALIZADA");
            }
        }
    }
}
