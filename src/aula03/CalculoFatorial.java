package aula03;

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número diferente de zero:");
        int numero = sc.nextInt();
        int fatorial = 1;
        if (numero == 0) {
            System.out.println("Número invalido.");
        } else {
            for (int i = 1; i <=numero; i++) {
                fatorial *= i;

            }
            System.out.printf("O fatorial do %d é %d.", numero, fatorial);
        }
    }
}
