package aula05;

import java.util.Scanner;

public class MultaVelocidade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a velocidade em que o motorista esta dirigindo:");
        int velocidadeDirigida = entrada.nextInt();
        System.out.println("Digite a velocidade máxima permitida na via:");
        int velocidadeMaxima = entrada.nextInt();

        int velocidaUltrapassada = velocidadeDirigida - velocidadeMaxima;

        if (velocidaUltrapassada >= 1 && velocidaUltrapassada <= 10) {
            System.out.println("A multa é de 50 reais.");
        } else if (velocidaUltrapassada >= 11 && velocidaUltrapassada <= 30) {
            System.out.println("A multa é de 100 reais.");
        } else {
            System.out.println("A multa é de 200 reais.");

        }
    }
}
