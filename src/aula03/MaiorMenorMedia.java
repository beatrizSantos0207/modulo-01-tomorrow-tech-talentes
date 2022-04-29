package aula03;

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextInt();
            media += numeros[i];

        }
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= maiorNumero) {
                maiorNumero = numeros[i];
            } else if (numeros[i] <= menorNumero) {
                menorNumero = numeros[i];

            }
        }
        System.out.printf("O maior numero é: %d \nO menor número é: %d \nA média dos números é %.2f",
                maiorNumero, menorNumero, media / 10);


    }
}
