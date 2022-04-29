package aula01;

import java.util.Scanner;

public class QuantidadeFerraduras {
    public static void main(String[] args) {
        final int PATAS_CAVALOS = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de cavalos comprados:");
        int cavalos = scan.nextInt();

        int quantidadeFerraduras = cavalos * PATAS_CAVALOS;

        System.out.println("A quantidade de ferraduras devará ser de: " + quantidadeFerraduras + " ferraduras");

    }
}
