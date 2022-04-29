package aula02;

import java.util.Scanner;

public class NumerosQuadrado {
    public static void main(String[] args) {
        int [] numeros = new int [4];
        double numeroQuadrado = 0;
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = entrada.nextInt();
            numeroQuadrado = Math.pow(numeros[i], 2);
            soma += numeroQuadrado;
            System.out.printf("O quadrado %d é %.1f \n", numeros[i], numeroQuadrado);
        }
        System.out.println("A soma total dos números é:"+ soma);
    }
}

