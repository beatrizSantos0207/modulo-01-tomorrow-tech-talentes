package aula05;

import java.util.Scanner;

public class CalculoDinheiroGastoFumante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int ANO = 365;

        System.out.println("Digite o número de anos que você fuma:");
        int anosFumados = entrada.nextInt();
        System.out.println("Digite o número de cigarros que fuma diariamente:");
        int cigarrosFumadosDiariamente = entrada.nextInt();
        System.out.println("Valor cartela de cigarro com 20 unidades:");
        double valorCartelaCigarros = entrada.nextDouble();

        int tempoFumanteDias = anosFumados * ANO;
        int totalCigarrosFumados = cigarrosFumadosDiariamente * tempoFumanteDias;
        double totalCartelaCigarros = (double) totalCigarrosFumados / 20;

        System.out.printf("O valor gasto em %d  anos é  R$%.2f: ", anosFumados,
                (totalCartelaCigarros * valorCartelaCigarros));


    }
}
