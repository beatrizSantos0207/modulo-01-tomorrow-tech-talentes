package aula04;

import java.util.Scanner;

public class CodigoDdd {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código de DDD:");
        int codigoDdd = entrada.nextInt();
        switch (codigoDdd) {
            case 11:
                System.out.println("São Paulo");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            case 32:
                System.out.println("Juiz de Jura");
                break;
            case 61:
                System.out.println("Brasília");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            default:
                System.out.println("DDD não cadastrado ");


        }
    }
}