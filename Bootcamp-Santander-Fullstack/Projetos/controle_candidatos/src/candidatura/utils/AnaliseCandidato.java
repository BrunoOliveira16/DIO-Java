package candidatura.utils;

import java.util.ArrayList;
import java.util.List;

import candidatura.data.Candidatos;
import candidatura.data.Salario;
import candidatura.model.Candidato;

public class AnaliseCandidato {
    public static List<Candidato> analise() {
        String[] nomesCandidatos = Candidatos.getCandidatos();
        List<Candidato> listaDeCandidatos = new ArrayList<>();
        double salarioBase = 2000.0;

        for (String nomeCandidato : nomesCandidatos) {
            Candidato candidato = new Candidato(nomeCandidato, Salario.valorPretendido());
            listaDeCandidatos.add(candidato);

            if (salarioBase > candidato.getSalarioPretendido()) {
                System.out.println(candidato.getNome() + " = LIGAR PARA O CANDIDATO");
            } else if (salarioBase == candidato.getSalarioPretendido()) {
                System.out.println(candidato.getNome() + " = LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
            } else {
                System.out.println(candidato.getNome() + " = AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            }
        }
        return listaDeCandidatos;
    }
}
