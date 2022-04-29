package aula03;

import java.util.Scanner;

public class NumeroIntervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = entrada.nextInt();
        int maiorNumero = 0;
        int menorNumero = 0;

        if (primeiroNumero > segundoNumero) {
            maiorNumero = primeiroNumero;
            menorNumero = segundoNumero;
        } else if (segundoNumero > primeiroNumero) {
            maiorNumero = segundoNumero;
            menorNumero = primeiroNumero;
        } else {
            System.out.println("Os numeros são iguais, nao existe intervalo entre eles.");
        }

        System.out.println("O intervalo é: ");
        for (int i = menorNumero; i<= maiorNumero; i++) {
            System.out.println(i);
        }
    }
}

