package aula05;

import java.util.Scanner;

public class NotasMediaAritimeticaPonderada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] notas = new double[3][2];
        System.out.println("Escolha uma das opções:\n(1)Média aritmética\n(2)Média ponderada\n");
        int entrada = scan.nextInt();
        double totalNotas = 0;
        double totalPeso = 0;

        switch (entrada) {
            case 1:
                System.out.println("Digite a 1ª nota:");
                double nota1 = scan.nextDouble();
                System.out.println("Digite a 2ª nota:");
                double nota2 = scan.nextDouble();
                System.out.printf("A média é %.2f:", (nota1 + nota2) / 2);
                break;

            case 2:
                for (int i = 0; i < 3; i++) {
                    System.out.printf("Digite a %dª nota:", (i + 1));
                    notas[i][0] = scan.nextDouble();
                    System.out.printf("Digite o peso da %dª nota:", (i + 1));
                    notas[i][1] = scan.nextDouble();
                    scan.nextLine();
                    totalNotas += notas[i][0];
                    totalPeso += notas[i][1];
                }
                System.out.printf("A média ponderada é %.2f:", (totalNotas / totalPeso));
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
