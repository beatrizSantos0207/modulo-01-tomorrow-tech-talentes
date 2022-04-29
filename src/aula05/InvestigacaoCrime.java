package aula05;

import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Telefonou para a vítima?: 1-Sim  2-Não ");
        int resposta1 = scanner.nextInt();
        contador = calculaRespostasSuspeitas(resposta1, contador);
        System.out.println("Esteve no local do crime?: 1-Sim  2-Não ");
        int resposta2 = scanner.nextInt();
        contador = calculaRespostasSuspeitas(resposta2, contador);
        System.out.println("Mora perto da vítima?: 1-Sim  2-Não ");
        int resposta3 = scanner.nextInt();
        contador = calculaRespostasSuspeitas(resposta3, contador);
        System.out.println("Devia para a vítima?: 1-Sim  2-Não ");
        int resposta4 = scanner.nextInt();
        contador = calculaRespostasSuspeitas(resposta4, contador);
        System.out.println("Já trabalhou com a vítima?: 1-Sim  2-Não ");
        int resposta5 = scanner.nextInt();
        contador = calculaRespostasSuspeitas(resposta5, contador);



        if (contador < 2) {
            System.out.println("Testemunha classificada como inocente.");
        } else if  (contador == 2) {
            System.out.println("Testemunha classificada como suspeita.");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Testemunha classificada como cumplice.");
        } else {
            System.out.println("Testemunha classificada como culpada.");
        }
    }

    private static int calculaRespostasSuspeitas(int resposta, int contador) {
        if (resposta == 1) {
            contador++;
        }
        return contador;
    }
}
