package aula01;

import java.util.Scanner;

public class CalculoDiasVida {
    public static void main(String[] args) {
        final int ANO= 365;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade:");
        int idade = sc.nextInt();
        System.out.println("Você viveu "+ (idade*ANO) + " dias");


    }
}
