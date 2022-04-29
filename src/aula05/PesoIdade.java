package aula05;

import java.util.Scanner;

public class PesoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalIdade= 0;
        int contador = 0;
        int idade = 0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite a idade da %dº pessoa:", (i + 1));
            idade = scan.nextInt();
            System.out.printf("Digite o peso da %dº pessoa:", (i + 1));
            double peso = scan.nextDouble();
            totalIdade += idade;

            if (peso > 90) {
                contador++;
            }
        }
        System.out.println("Quantidade de pessoas com mais de 90 quilos é" + contador);
        System.out.println("Média das idades das sete pessoas é" + totalIdade / 7);

    }
}

