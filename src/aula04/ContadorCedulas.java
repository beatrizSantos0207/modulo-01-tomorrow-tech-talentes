package aula04;

import java.util.Scanner;

public class ContadorCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de entrada:");
        int valor = scan.nextInt();
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};
        int contadorCedula = 0;
        int valoratual = valor;

        System.out.println("O numero de cedulas necessário para o valor " + valor  + " é:");

        for (int cedula : cedulas) {

            if((valoratual / cedula) > 0) {

                contadorCedula = (valoratual / cedula);
                valoratual = valoratual % cedula;

                System.out.println(contadorCedula + " de R$"+cedula);
            }

        }


    }
}


