package aula03;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso em Kg:");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura em m:");
        double altura = entrada.nextDouble();
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.printf("O imc é %.2f e  esta abaixo do peso ideal.", imc);
        } else if (imc > 18.5 && imc < 24.5) {
            System.out.printf("O imc é %.2f e o peso esta normal.", imc);
        } else if (imc > 25.0 && imc < 29.99) {
            System.out.printf("O imc é %.2f e esta acima do peso ideal.", imc);

        } else if (imc > 30.0) {
            System.out.printf("O imc é %.2f e esta muito acima do ideal, obesidade morbida.", imc);
        }


    }

}




