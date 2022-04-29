package aula06;

import java.util.Scanner;

public class CalculoCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoGasolina = 7.25;
        double distanciaKm = 1000;
        double carroMaisEconomico = 0;
        String nomeCarroMaisEconomico = "";
        double totalCombustivel = 0;
        double totalGastoCombustivel = 0;

        String[] nomeCarros = new String[5];
        double[] consumoCarros = new double[5];

        for (int i = 0; i < consumoCarros.length; i++) {
            System.out.printf("Nome do  %dº veículo:", (i + 1));
            nomeCarros[i] = (scanner.next());
            System.out.printf("Quilometros por litro do %d:", (i + 1));
            consumoCarros[i] = scanner.nextDouble();

            if (consumoCarros[i] > carroMaisEconomico) {
                carroMaisEconomico = consumoCarros[i];
                nomeCarroMaisEconomico = nomeCarros[i];
            }
        }

        System.out.println("\nComparativo de Consumo de Combustível\n");

        for (int i = 0; i < consumoCarros.length; i++) {
            System.out.println("Veículo: " + (i + 1));
            System.out.println("Nome: " + nomeCarros[i]);
            System.out.println("Km por litro: " + consumoCarros[i]);
        }
        System.out.println("\nRelatório final");

        for (int i = 0; i < nomeCarros.length; i++) {
            totalCombustivel = distanciaKm / consumoCarros[i] ;
            totalGastoCombustivel = totalCombustivel * precoGasolina;
            System.out.printf("%d - %s - %.1f - %.1f litros - R$%.2f\n", (i+1), nomeCarros[i], consumoCarros[i], totalCombustivel, totalGastoCombustivel);
        }
        System.out.printf("O menor consumo é do %s", nomeCarroMaisEconomico);
    }
}
