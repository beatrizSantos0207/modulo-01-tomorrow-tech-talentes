package aula04;

import java.util.Scanner;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] numeros = new double[3][3];
        double maior = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero da posição [%d][%d]: \n ", i, j);
                numeros[i][j] = scan.nextDouble();
                if (numeros[i][j] > maior) {
                    maior =  numeros[i][j];
                }
            }
        }
        System.out.println(maior);
    }
}
