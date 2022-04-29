package aula05;

import java.util.Scanner;

public class InvestigacaoCrimeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String[] perguntas = {"Telefonou para a vítima?: 1-Sim  2-Não ", "Esteve no local do crime?: 1-Sim  2-Não ",
                "Mora perto da vítima?: 1-Sim  2-Não ", "Devia para a vítima?: 1-Sim  2-Não ",
                "Já trabalhou com a vítima?: 1-Sim  2-Não "};

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            int resposta = scanner.nextInt();
            if (resposta == 1) {
                contador++;
            }
        }
        if (contador < 2) {
            System.out.println("Testemunha classificada como inocente.");
        } else if (contador == 2) {
            System.out.println("Testemunha classificada como suspeita.");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Testemunha classificada como cumplice.");
        } else {
            System.out.println("Testemunha classificada como culpada.");
        }
    }
}
