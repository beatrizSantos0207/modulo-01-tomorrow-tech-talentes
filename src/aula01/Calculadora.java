package aula01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Insira o segundo primeiro:");
        double segundoNumero = sc.nextDouble();

        double soma = primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;


        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }
}
