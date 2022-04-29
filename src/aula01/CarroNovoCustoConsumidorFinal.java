package aula01;

import java.util.Scanner;

public class CarroNovoCustoConsumidorFinal {
    public static void main(String[] args) {
        final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
        final double IMPOSTOS = 0.45;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do custo de fábrica do veículo:");
        double custoFabrica= scan.nextDouble();

         double custoFinal = (custoFabrica * (PORCENTAGEM_DISTRIBUIDOR + IMPOSTOS) + custoFabrica);

        System.out.println("O custo final do carro é de R$:" + custoFinal);
    }
}
