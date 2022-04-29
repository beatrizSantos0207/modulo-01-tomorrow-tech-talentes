package aula03;

import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero = 0;

        do {
            System.out.println("Insira um novo numero:");
            numero = scan.nextDouble();
            if (numero < 0) {
                System.out.println("Esse é um número negatigo ");
            } else if (numero > 0) {
                System.out.println("Esse é um numero positivo");
            }
        } while (numero != 0);
    }
}

