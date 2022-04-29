package aula06;

import java.util.Scanner;

public class LojaTintasGalaoLata {
    public static final double VALOR_LATA_TINTA_18_L = 80;
    public static final double LITROS_LATA_TINTA = 18;
    public static final double VALOR_GALAO_TINTA = 25;
    public static final double LITROS_GALAO_TINTA = 3.6;

    public static void main(String[] args) {
        final double PROPORCAO_COBERTURA_TINTA=0.166;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada ");
        double areaPintar = scanner.nextDouble();

        double quantidadeTinta = areaPintar*PROPORCAO_COBERTURA_TINTA;
        double precoTotalLata= (quantidadeTinta*VALOR_LATA_TINTA_18_L)/LITROS_LATA_TINTA;
        double quantidadeLata = (quantidadeTinta/LITROS_LATA_TINTA);

        double precoTotalGalao = (quantidadeTinta*VALOR_GALAO_TINTA)/LITROS_GALAO_TINTA;
        double quantidadeGalao = (quantidadeTinta)/LITROS_GALAO_TINTA;


        System.out.printf("Precisará de %.2f latas de tinta e custará %.2f", quantidadeLata, precoTotalLata);
        System.out.printf("Precisará de %.2f latas de tinta e custará %.2f", quantidadeGalao, precoTotalGalao);

    }
}
