package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class ArmazenamentoMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] numeros = new double[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o numero da posição [%d][%d]: \n ", i,j );
                numeros[i][j] = scan.nextDouble();
            }

        }
        System.out.println(Arrays.deepToString(numeros));

    }
}
