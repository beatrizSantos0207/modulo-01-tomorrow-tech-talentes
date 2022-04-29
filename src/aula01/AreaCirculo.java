package aula01;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        double raio = scan.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio,2);

        System.out.printf("A area do círculo é de %.2f" ,areaCirculo);
    }
}
