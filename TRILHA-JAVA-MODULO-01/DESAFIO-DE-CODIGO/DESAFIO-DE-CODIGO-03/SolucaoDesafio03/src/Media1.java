import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            double A, B, media;

            System.out.println("Digite as notas A e B, para calcular a média");
            A = leitor.nextDouble();
            B = leitor.nextDouble();

            // Nota A tem peso 3.5 e Nota B tem peso 7.5
            media = (A * 3.5 + B * 7.5) / 11;

            System.out.printf("MEDIA = %.5f %n", media);
            // utilizando o printf com a sintaxe %.5f eu limito o numero de casas decimais
            // em 5, na exibição do resultado. O %n quebra uma linha.
        }
    }
}
