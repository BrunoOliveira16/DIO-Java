import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = leitor.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = leitor.next();

            System.out.println("Digite sua idade");
            int idade = leitor.nextInt();

            System.out.println("Digite sua altura");
            double altura = leitor.nextDouble();

            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        }

    }
}
