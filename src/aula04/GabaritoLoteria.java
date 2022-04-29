package aula04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GabaritoLoteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] gabarito = new int[13];
        int acertos = 0;
        int numeroCartao = 0;
        int[] aposta = new int[13];

        Random random = new Random();

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = random.nextInt(3) + 1;
        }


        System.out.printf("Digite a quantidade de apostadores: ");
        int qtdApostadores = scan.nextInt();

        for (int i = 0; i < qtdApostadores; i++) {

            System.out.println("Digite o número do cartão do apostador " + (i + 1));
            numeroCartao = scan.nextInt();

            System.out.println("Digite os numeros da aposta do apostador " + (i + 1));

            for (int j = 0; j < gabarito.length; j++) {
                aposta[j] = scan.nextInt();
                if (gabarito[j] == aposta[j]) {
                    acertos++;
                }
            }

            if (acertos == 13) {
                System.out.println("Ganhador");
            }
            System.out.printf("O Apostador com numero  %d teve %d acertos.\n", numeroCartao, acertos);


        }
        System.out.println(Arrays.toString(gabarito));

    }
}

