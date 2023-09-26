import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int A, B, PROD;

            System.out.println("Digite os números A e B, para a multiplicação");
            A = leitor.nextInt();
            B = leitor.nextInt();
            PROD = A * B;

            System.out.println("O Resultado é " + PROD);
        }
    }
}
