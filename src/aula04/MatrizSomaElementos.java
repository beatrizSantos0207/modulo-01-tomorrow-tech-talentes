package aula04;

import java.util.Scanner;

public class MatrizSomaElementos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] numeros = new double[3][3];
        double soma=0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero da posição [%d][%d]: \n ", i, j);
                numeros[i][j] = scan.nextDouble();
                soma+=numeros[i][j];

            }
        }
        System.out.println(soma);

    }


}
