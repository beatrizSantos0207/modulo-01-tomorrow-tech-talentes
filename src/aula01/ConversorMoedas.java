package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);
        System.out.println("Insira o valor em reais:");
        BigDecimal reaisValue = new BigDecimal(currency.nextDouble());

        System.out.println("Insira a cotação do dolar do dia:");
        BigDecimal dollarValue = new BigDecimal(currency.nextDouble());

        System.out.println("Insira a cotação do euro do dia:");
        BigDecimal euroValue = new BigDecimal(currency.nextDouble());

        System.out.println("Insira a cotação da libra do dia:");
        BigDecimal lbValue = new BigDecimal(currency.nextDouble());

        BigDecimal reaisToDollarConversion = reaisValue.divide(dollarValue, 3, RoundingMode.HALF_UP);
        BigDecimal reaisToEuroConversion= reaisValue.divide(euroValue, 3,RoundingMode.HALF_UP);
        BigDecimal reaisToLibraConversion= reaisValue.divide(lbValue,3,RoundingMode.HALF_UP);

        System.out.println("R$" + reaisValue + " corresponde a US$" + reaisToDollarConversion);
        System.out.println("R$" + reaisValue + " corresponde a €" + reaisToEuroConversion);
        System.out.println("R$" + reaisValue + " corresponde a £" + reaisToLibraConversion);









    }
}
