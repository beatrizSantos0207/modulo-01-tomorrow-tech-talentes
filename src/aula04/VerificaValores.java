package aula04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VerificaValores {
    public static void main(String[] args) {

        int[] valores = new int[10];
        Random aleatorio = new Random();
        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = aleatorio.nextInt(100);
            System.out.println(Arrays.toString(valores));
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número procurado:");
        int numeroProcurado = entrada.nextInt();

        for (int valor : valores) {
            if (numeroProcurado == valor) {
                contador += 1;
            }
        }

        if (contador > 0) {
            System.out.println("O valor existe no conjunto.");
        } else {
            System.out.println("--");
        }

    }
}


