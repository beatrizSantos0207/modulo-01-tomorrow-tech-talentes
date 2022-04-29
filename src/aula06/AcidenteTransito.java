package aula06;

import java.util.Scanner;

public class AcidenteTransito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] acidentesTransito = new double[5][3];
        int posicaoMaiorCidade = 0;
        int posicaoMenorCidade = 0;
        double totalVeiculos = 0;
        double maiorIndice = 0;
        double menorIndice = Integer.MAX_VALUE;
        double totalAcidentes = 0;
        int contador = 0;

        for (int i = 0; i < acidentesTransito.length; i++) {
            System.out.printf("Digite o codigo da %dª cidade:", (i + 1));
            acidentesTransito[i][0] = scanner.nextDouble();
            System.out.printf("Número de veículos de passeio %dª cidade:", (i + 1));
            acidentesTransito[i][1] = scanner.nextDouble();
            System.out.printf("Número de acidentes de trânsito com vítimas:", (i + 1));
            acidentesTransito[i][2] = scanner.nextDouble();
            totalVeiculos += acidentesTransito[i][1];
        }
        for (int i = 0; i < acidentesTransito.length; i++) {
            if (acidentesTransito[i][2] > maiorIndice) {
                maiorIndice = acidentesTransito[i][2];
                posicaoMaiorCidade = i;

            }
            if (acidentesTransito[i][2] < menorIndice) {
                menorIndice = acidentesTransito[i][2];
                posicaoMenorCidade = i;
            }
            if (acidentesTransito[i][1] < 2000) {
                contador++;
                totalAcidentes += acidentesTransito[i][2];
            }
        }

        System.out.printf("O maior indice de acidente é %.2f e pertence a cidade:%.2f\n",
                maiorIndice, acidentesTransito[posicaoMaiorCidade][0]);
        System.out.printf("O menor indice de acidente é %.2f e pertence a cidade: %.2f\n",
                menorIndice, acidentesTransito[posicaoMenorCidade][0]);
        System.out.printf("A média de veículos nas cinco cidades juntas %.2f", totalVeiculos / 5);
        System.out.printf("\n A média de acidentes de trânsito nas cidades com\n" +
                "menos de 2.000 veículos de passeio %.2f.", totalAcidentes / contador);


    }
}

