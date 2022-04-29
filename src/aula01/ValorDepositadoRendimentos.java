package aula01;

import java.math.BigDecimal;
import java.util.Scanner;

public class ValorDepositadoRendimentos {
    public static void main(String[] args) {
        final double TAXA_JUROS_MES = 0.7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor a ser depositado:");
        BigDecimal valorDepositado = new BigDecimal(sc.nextDouble());
        BigDecimal redimentos= valorDepositado.multiply(BigDecimal.valueOf(TAXA_JUROS_MES));

        System.out.printf("O valor total com redimentos da sua poupança esse mês foi de: R$" +
                "%.2f %n", redimentos.add(valorDepositado));
    }
}
