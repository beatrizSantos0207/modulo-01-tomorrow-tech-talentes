package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculoPrestacoesLoja {
    static final double PRESTACOES = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor total de sua compra:");
        BigDecimal valorTotal = scan.nextBigDecimal();
        BigDecimal valorPrestacoes = valorTotal.divide(BigDecimal.valueOf(PRESTACOES),
                2, RoundingMode.HALF_UP);

        System.out.println("O valor das prestações serão 5x de R$:" + valorPrestacoes);

    }
}
