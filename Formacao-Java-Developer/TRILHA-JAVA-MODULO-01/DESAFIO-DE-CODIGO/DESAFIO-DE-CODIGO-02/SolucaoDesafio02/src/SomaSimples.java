import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int A, B, SOMA;

            System.out.println("Digite o número A e B, para realizar a soma");
            A = leitor.nextInt();
            B = leitor.nextInt();
            SOMA = A + B;

            System.out.println("O resultado é " + SOMA);
        }
    }
}
