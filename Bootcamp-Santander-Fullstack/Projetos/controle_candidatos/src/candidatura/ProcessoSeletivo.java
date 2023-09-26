package candidatura;

import java.util.List;

import candidatura.model.Candidato;
import candidatura.utils.EntrandoEmContato;
import candidatura.utils.AnaliseCandidato;
import candidatura.utils.ImprimeSelecionados;
import candidatura.utils.SelecaoCandidatos;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("======================== LISTA DE CANDIDATOS ========================");
        List<Candidato> candidatosAnalisados = AnaliseCandidato.analise();

        System.out.println("");
        System.out.println("======================== CANDIDATOS SELECIONADOS ========================");
        List<Candidato> candidatosSelecionados = SelecaoCandidatos.selecao(candidatosAnalisados);
        ImprimeSelecionados.imprimir(candidatosSelecionados);

        System.out.println("");
        System.out.println("======================== CONTATO COM CANDIDATOS ========================");
        EntrandoEmContato.emContato(candidatosSelecionados);

        System.out.println("");
    }
}
