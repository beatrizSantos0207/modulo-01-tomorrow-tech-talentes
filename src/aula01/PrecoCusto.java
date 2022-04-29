package aula01;

import java.util.Scanner;

public class PrecoCusto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o preço de custo do produto:");
        double precoCusto = scan.nextDouble();
        System.out.println("Percentual de lucro esperado para o produto:");
        double percentualLucro= scan.nextDouble();
        double valorFinalVenda = (precoCusto * percentualLucro) + precoCusto;

        System.out.println("O valor final para venda deverá ser de R$: " + valorFinalVenda);
    }
}
