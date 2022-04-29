package aula03;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumeroAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        int contador = 1;
        boolean isNumeroIncorreto = true;

        do {
            System.out.println("Insira um novo numero:");
            numero = scan.nextInt();

            if (numero > numeroAleatorio) {
                System.out.println("O número informado é maior que o número.");
            } else if (numero < numeroAleatorio) {
                System.out.println("O número informado é menor que o número.");
            } else {
                isNumeroIncorreto = false;
            }
            contador++;
        } while (contador <= 3 && isNumeroIncorreto);

        if (isNumeroIncorreto) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Você acertou o número.");
        }

    }
}
