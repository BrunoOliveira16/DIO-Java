public class MinhaClasse {

    public static void main(String[] args) {

        System.out.println("Olá Turma, sejam bem-vindos!");

        // int ano = 2022;
        // ano = 2023;

        // final String BR = "Brasil";
        // BR = "Brazil"; // por ser uma variavel em letras maiusculas ela não pode
        // receber outros valores

        // Declarando variaveis
        String primeiroNome = "Bruno";
        String segundoNome = "Oliveira";
        int anoFabricacao = 2022;
        boolean verdadeiro = true;

        System.out.println(primeiroNome);
        System.out.println(anoFabricacao);
        System.out.println(verdadeiro);

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
