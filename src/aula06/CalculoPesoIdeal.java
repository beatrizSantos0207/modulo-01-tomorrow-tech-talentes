package aula06;

import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoIdeal = 0;

        System.out.println("Qual o sexo: 1-homem 2-mulher");
        int sexo = scanner.nextInt();
        System.out.println("Digite a altura");
        double altura = scanner.nextDouble();
        switch (sexo) {

            case 1:
                pesoIdeal=(72.7*altura) -58;
                System.out.printf("O peso ideal é: %.2f kg" , pesoIdeal);
                break;

            case 2:
                pesoIdeal =  (62.1*altura) - 44.7;
                System.out.printf("O peso ideal é: %.2f kg" , pesoIdeal);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

}
