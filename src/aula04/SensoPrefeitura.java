package aula04;

import java.util.Scanner;

public class SensoPrefeitura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double maiorSalario = -1;
        int salarioMenor150 = 0;
        double totalSalario = 0;
        int totalFilhos = 0;
        int habitantes= 0;

        while(true) {
            System.out.println("Digite o salário: ");
            double salario = entrada.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.printf("Digite o numero de filhos  morador:");
            int numeroFilhos = entrada.nextInt();
            habitantes++;
            totalSalario += salario;
            totalFilhos += numeroFilhos;


            if (salario> maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 150) {
                salarioMenor150++;
            }
        }

        double percentualSalario =  ((double) salarioMenor150/habitantes)*100;

        System.out.println("Média de salário:" + (totalSalario/habitantes));
        System.out.println("Maior salário:" + maiorSalario);
        System.out.println("Média de filhos:" + (totalFilhos/habitantes));
        System.out.println("Percentual salário menor que 150 :" + percentualSalario + "%");

    }

}
