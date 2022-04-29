package aula05;

import java.util.Scanner;

public class OpiniaoFilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] idadeOpiniao = new int[5][2];
        int contadorOtimo = 0;
        int contadorRegular = 0;
        int contadorBom = 0;
        double totalAgesOtimo = 0;

        double percentageSpectators = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua idade:");
            idadeOpiniao[i][0] = scanner.nextInt();
            System.out.printf("Digite :\n3 - ótimo \n2 - bom  \n1 - regular \n");
            idadeOpiniao[i][1] = scanner.nextInt();

            if (idadeOpiniao[i][1] == 3) {
                contadorOtimo++;
                totalAgesOtimo += idadeOpiniao[i][0];
            } else if (idadeOpiniao[i][1] == 2) {
                contadorBom++;
            } else if (idadeOpiniao[i][1] == 1) {
                contadorRegular++;
            }
        }

        percentageSpectators =  ((double) contadorBom /5) * 100;
        double mediaOtimo = contadorOtimo != 0 ? (totalAgesOtimo / contadorOtimo) : 0;

        System.out.println("A média das idades das pessoas que responderam ótimo: " + mediaOtimo);
        System.out.println("A quantidade de pessoas que respondeu regular é: " + contadorRegular);
        System.out.printf("Percentual bom: %.2f", percentageSpectators);

    }
}


