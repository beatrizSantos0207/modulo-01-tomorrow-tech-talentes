package aula06;

import java.util.Scanner;


public class CalculoSaltosAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] saltos = new double[5];
        double melhorSalto = 0;
        double totalSaltosMedianos = 0;
        double piorSalto = Integer.MAX_VALUE;

        System.out.println("Digite o nome do atleta:");
        String nomeAtleta = scanner.nextLine();

        for (int i = 0; i < saltos.length; i++) {
            System.out.printf("Digite a distancia do %dº salto:", (i + 1));
            saltos[i] = scanner.nextDouble();

            if (saltos[i] > melhorSalto) {
                melhorSalto = saltos[i];

            }
            if (saltos[i] < piorSalto) {
                piorSalto = saltos[i];
            }
        }

        //SUA LOGICA ESTAVA CORRETISSIMA, DEIXOU APENAS ESCAPAR A REGRA DO ENUNCIADO
        System.out.println("Atleta: " + nomeAtleta);
        for (int i = 0; i < saltos.length; i++) {
            System.out.println(getLiteralNumero(i + 1) + "º salto:" + saltos[i]);
            if (saltos[i] != melhorSalto && saltos[i] != piorSalto) {
                totalSaltosMedianos += saltos[i];
            }
        }

        System.out.println("\nO melhor salto: " + melhorSalto + " m");
        System.out.println("O pior salto:" + piorSalto + " m");
        System.out.printf("A média dos demais saltos: %.2f m", totalSaltosMedianos / 3);
    }

    private static String getLiteralNumero(int posicao) {
        String posicaoLiteral = "";
        switch (posicao) {
            case 1:
                posicaoLiteral = "Primeiro";
                break;
            case 2:
                posicaoLiteral = "Segundo";
                break;
            case 3:
                posicaoLiteral = "Terceiro";
                break;
            case 4:
                posicaoLiteral = "Quarto";
                break;
            case 5:
                posicaoLiteral = "Quinto";
                break;
            default:
                posicaoLiteral = "Inválido";
                break;
        }
        return posicaoLiteral;
    }
}
