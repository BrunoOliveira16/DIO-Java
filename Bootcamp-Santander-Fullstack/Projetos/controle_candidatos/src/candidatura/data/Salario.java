package candidatura.data;

import java.util.concurrent.ThreadLocalRandom;

public class Salario {
    // Método que simula o valor pretendido
    public static double valorPretendido() {
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        valor = Math.round(valor * 100.0) / 100.0;
        return valor;
    }
}
