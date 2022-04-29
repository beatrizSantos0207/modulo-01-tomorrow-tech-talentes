package aula01;

import java.util.Scanner;

public class QuantidadeCavalos {

    public static final double FATOR_CONVERSAO_CAVALOS = 745.6999;

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso em quilogramas:");
        double massa = entrada.nextDouble();
        System.out.println("Digite a altura:");
        double altura = entrada.nextDouble();
        System.out.println("Digite o tempo em segundos:");
        double tempo = entrada.nextDouble();


        double cavalos = ((massa * altura )/ tempo) / FATOR_CONVERSAO_CAVALOS;

        System.out.printf("A quantidadades de cavalos nescessarios é %.2f cavalos." ,cavalos);
    }
}
