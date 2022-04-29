package aula04;

import java.util.Arrays;

public class MatrizSomaLinhasColunas {
    public static void main(String[] args) {
        int[][] matriz = {{33, 21, 76, 81, 65}, {11, 87, 43, 16, 27}, {42, 31, 64, 89, 23}};
        int soma = 0;
        int[] somaLinha = new int[3];
        int[] somaColuna = new int[5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
            somaLinha[i] = soma;
            soma = 0;
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                soma += matriz[i][j];
            }
            somaColuna[j] = soma;
            soma = 0;
        }
        System.out.println(Arrays.toString(somaLinha));
        System.out.println(Arrays.toString(somaColuna));

        int[][] matrizSomatorio = {somaLinha, somaColuna};

        System.out.println(Arrays.deepToString(matrizSomatorio));

    }
}