package aula06;

import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        final double PROPORCAO_COBERTURA_TINTA=0.3333;

        int litrosLataTinta= 18;
        double valorLataTinta=80;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada ");
        double areaPintar = scanner.nextDouble();

        double quantidadeTinta = areaPintar*PROPORCAO_COBERTURA_TINTA;
        double precoTotal= (quantidadeTinta*valorLataTinta)/litrosLataTinta;
        double quantidadeLata = (quantidadeTinta/18);

        System.out.printf("Precisará de %.2f latas de tinta e custará %.2f", quantidadeLata, precoTotal);
    }
}
