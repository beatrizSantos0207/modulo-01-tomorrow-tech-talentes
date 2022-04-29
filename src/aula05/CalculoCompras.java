package aula05;

import java.util.Locale;
import java.util.Scanner;

//ADICIONEI UM DESCONTO E JUROS PARA SIMULAR UMA LOJA
public class CalculoCompras {
    public static final double DESCONTO_COMPRA_A_VISTA = 0.05;
    public static final double JUROS_COMPRA_A_PRAZO = 0.10;

    public static void main(String[] args) {
        int[] valorTransacoes = new int[15];
        String codigoTransacoes = "";
        Scanner entrada = new Scanner(System.in);
        double totalCompras = 0;
        double totalComprasVista = 0;
        double totalComprasPrazo = 0;

        for (int i = 0; i < valorTransacoes.length; i++) {
            System.out.println("Digite o código da compra: (V) a vista, (P) a prazo");
            codigoTransacoes = entrada.next().toUpperCase(Locale.ROOT);
            System.out.printf("Digite o valor da %dª compra:", (i + 1));
            valorTransacoes[i] = entrada.nextInt();
            totalCompras += valorTransacoes[i];

            if (codigoTransacoes.equals("V")) {
                totalComprasVista += valorTransacoes[i];
            } else if (codigoTransacoes.equals("P")) {
                totalComprasPrazo += valorTransacoes[i];
            }
        }

        System.out.println("Total das compras:" + totalCompras);
        System.out.println("Compra a vista:" + (totalComprasVista - (totalComprasVista * DESCONTO_COMPRA_A_VISTA)));
        System.out.println("Compra a prazo:" + (totalComprasPrazo + (totalComprasPrazo * JUROS_COMPRA_A_PRAZO)));
        System.out.printf("A primeira prestação será de: %.2f", ((totalComprasPrazo +
                (totalComprasPrazo * JUROS_COMPRA_A_PRAZO)) / 3));


    }

}

