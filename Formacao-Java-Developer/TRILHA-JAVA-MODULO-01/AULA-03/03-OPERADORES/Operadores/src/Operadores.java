import java.util.Date;

public class Operadores {

    public static void main(String[] args) {

        // Operadores de atribuição
        String nome = "Bruno";
        int idade = 35;
        double peso = 66.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
        System.out.println(dataNascimento);

        // Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        // ATENÇÃO! O operador de adição (+), quando utilizado
        // em variáveis do tipo texto, realizará a "concatenação de textos".
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        // Operadores unários
        int valor = 5;
        valor = -valor;
        System.out.println(valor); // Valor da sáida é negativo

        valor = valor * -1;
        System.out.println(valor); // Valor da sáida é positivo

        // Incremento
        int valorA = 5;
        valorA = valorA + 1;
        System.out.println(valorA);

        int valorB = 5;
        // System.out.println(valorB ++);
        System.out.println(++valorB); // Incrementando
        System.out.println(valorB);
        System.out.println(--valorB); // decrementando
        // System.out.println(valorB --);

        // Operador de Negação
        boolean variavel = true;
        System.out.println(variavel); // valor original
        System.out.println(!variavel); // valor false devido ao operador de negado

        variavel = !variavel;
        System.out.println(!variavel); // valor passa a ser novamente true, pois a variavel antes erá false

        // Operador Ternário
        int a, b;
        a = 6;
        b = 6;
        String resultadoAB = "";

        // Exemplo de condicional utilizando uma estrutura if/else
        if (a == b) {
            resultadoAB = "Verdadeiro";
        } else {
            resultadoAB = "Falso";
        }
        System.out.println(resultadoAB);

        // Mesma condicional utilizando o operador ternário
        resultadoAB = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultadoAB);

        // Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        // Igual
        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a numero2? " + simNao);

        // Diferente
        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente de numero2? " + simNao);

        // Maior
        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que numero2? " + simNao);

        // Menor
        simNao = numero1 < numero2;
        System.out.println("Numero1 é menor que numero2? " + simNao);

        // Método equals compara conteúdos, é a forma mais recomendada para objetos
        String nome1 = "Bruno";
        String nome2 = new String("Bruno");
        System.out.println(nome1.equals(nome2));

        // Operadores Lógicos
        // Operador "E" = &&
        // Operador "OU" = ||
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Teste 01: As duas condições são verdadeiras");
        } else {
            System.out.println("Teste 01: As duas condições não são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Teste 02: Uma das duas condições é verdadeira");
        } else {
            System.out.println("Teste 02: As duas condições são falsas");
        }

    }

}
