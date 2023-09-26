package candidatura.data;

import java.util.Random;

public class Ligacao {
    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
