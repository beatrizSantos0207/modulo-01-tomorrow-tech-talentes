package aula04;

import java.util.Arrays;
import java.util.Random;

public class NumerosAleatóriosArray {
    public static void main(String[] args) {
        double [] numeroAleatorio = new double[10];
        Random aleatorio = new Random();

        for (int i = 0; i < numeroAleatorio.length; i++) {
           numeroAleatorio[i] = aleatorio.nextInt(100);

        }
        System.out.println("Número inteiro aleatório de 10 até 100: " + Arrays.toString(numeroAleatorio));

    }
}
