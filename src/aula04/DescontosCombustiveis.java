package aula04;

import java.util.Locale;
import java.util.Scanner;



public class DescontosCombustiveis {

    private static final double LITRO_ALCOOL = 5.20;
    private static final double LITRO_GASOLINA = 7.59;
    private static final double DESCONTO_ATE_20_LITROS_ALCOOL = 0.03;
    private static final double DESCONTO_ACIMA_20_LITROS_ALCOOL = 0.05;
    private static final double DESCONTO_ATE_20_LITROS_GASOLINA = 0.04;
    private static final double DESCONTO_ACIMA_20_LITROS_GASOLINA = 0.06;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String alcool = "A";
        String gasolina = "G";

        System.out.println("Digite qual combustível deseja comprar: A-alcool e G-gasolina.");
        String combustivel = entrada.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Digite a quantidade de combustível em litros que deseja comprar:");
        double quantidade = entrada.nextDouble();

        double valorFinal=0;

        if (combustivel.equals(alcool) ) {
            valorFinal =  calculaValorAlcool(quantidade);
        } else if (combustivel.equals(gasolina)) {
            valorFinal = calculaValorGasolina(quantidade);
        }

        System.out.println("O valor final do combustivel é: " + valorFinal);
    }

    private static double calculaValorGasolina(double quantidade) {
        double valorSemDescontoGasolina;
        double valorFinal = 0;
        if (quantidade <20) {
            valorSemDescontoGasolina= (quantidade *LITRO_GASOLINA);
            valorFinal= valorSemDescontoGasolina - (valorSemDescontoGasolina *
                    DESCONTO_ATE_20_LITROS_GASOLINA);

        } else {
            valorSemDescontoGasolina= (quantidade *LITRO_GASOLINA);
            valorFinal = valorSemDescontoGasolina - (valorSemDescontoGasolina *
                    DESCONTO_ACIMA_20_LITROS_GASOLINA);
        }
        return valorFinal;
    }

    private static double calculaValorAlcool(double quantidade) {
        double valorFinal = 0;
        double valorSemDescontoAlcool;
        if (quantidade <20) {
            valorSemDescontoAlcool= (quantidade *LITRO_ALCOOL);
            valorFinal = valorSemDescontoAlcool - (valorSemDescontoAlcool *
                    DESCONTO_ATE_20_LITROS_ALCOOL);

        } else {
            valorSemDescontoAlcool= (quantidade *LITRO_ALCOOL);
            valorFinal = valorSemDescontoAlcool - (valorSemDescontoAlcool *
                    DESCONTO_ACIMA_20_LITROS_ALCOOL);

        }
        return valorFinal;
    }
}
