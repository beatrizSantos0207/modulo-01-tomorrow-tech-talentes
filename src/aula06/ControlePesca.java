package aula06;

import java.util.Scanner;

public class ControlePesca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excesso = 0;
        final double PESO_REGULAMENTO = 50;
        double multa = 0;
        System.out.println("Digite o peso dos peixes:");
        double pesoPeixes = scanner.nextDouble();

        if (pesoPeixes > PESO_REGULAMENTO) {
            excesso = pesoPeixes - PESO_REGULAMENTO;
            multa = excesso * 4;

        } else {
            System.out.println("Peso de peixes dentro estabelecido pelo regulamento " +
                    "de pesca do estado de São Paulo.");
        }
        System.out.println("Peso dos peixes: " + pesoPeixes + " kg");
        System.out.printf("Peso excedente: %.2f", excesso);
        System.out.printf("\nMulta R$:%.2f", multa);

    }
}
