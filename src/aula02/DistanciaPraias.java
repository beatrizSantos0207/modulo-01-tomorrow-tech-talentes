package aula02;

import java.util.Scanner;

public class DistanciaPraias {
    public static void main(String[] args) {
        String[] praias = new String[3];
        int[] praiadistancia = new int[3];

        int praiaAtual = 0;
        int posicaoPraiaMaisDistante = 0;
        double valorMedia = 0;
        int contadorPraias = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < praias.length; i++) {
            System.out.println("Digite o nome da praia:");
            praias[i] = sc.next();
            System.out.println("Digite a distancia da praia em Km");
            praiadistancia[i] = sc.nextInt();
            posicaoPraiaMaisDistante = praiaAtual > praiadistancia[i] ? posicaoPraiaMaisDistante
            : i;
            praiaAtual = praiadistancia[i];
            valorMedia = valorMedia + praiadistancia[i];
            contadorPraias = contadorPraias + (praiadistancia[i] <= 15 && praiadistancia[i] >= 10 ? 1 : 0);
        }

        System.out.printf("A praia mais distante é %s %n",praias[posicaoPraiaMaisDistante]);
        System.out.printf("O número de praias entre 10Km e 15Km é: %d %n", contadorPraias);
        System.out.printf("O valor médio entre as praias é %.2f", valorMedia/3);


    }
}

