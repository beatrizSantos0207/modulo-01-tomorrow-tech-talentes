package aula05;

import java.util.Scanner;

public class CalculoFolhaPagamento {
    public static final double TAXA_FGTS = 0.11;
    public static final double FATOR_IR_SALARIO_BRUTO_1500 = 0.05;
    public static final double FATOR_IR_SALARIO_BRUTO_ATE_2500 = 0.10;
    public static final double FATOR_SALARIO_BRUTO_ACIMA_2500 = 0.20;
    public static final double DESCONTO_SINDICATO = 0.03;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora:");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horasTrabalhadas = scanner.nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        double contribuicaoSindicato = 0;
        double fgts = 0;
        double descontoIr = 0;

        if (salarioBruto <= 900) {
            contribuicaoSindicato = salarioBruto * DESCONTO_SINDICATO;
            fgts = salarioBruto * TAXA_FGTS;

        } else if (salarioBruto >= 901 && salarioBruto <= 1500) {
            contribuicaoSindicato = salarioBruto * DESCONTO_SINDICATO;
            fgts = salarioBruto * TAXA_FGTS;
            descontoIr = salarioBruto * FATOR_IR_SALARIO_BRUTO_1500;

        } else if (salarioBruto >= 1501 && salarioBruto <= 2500) {
            contribuicaoSindicato = salarioBruto * DESCONTO_SINDICATO;
            fgts = salarioBruto * TAXA_FGTS;
            descontoIr = salarioBruto * FATOR_IR_SALARIO_BRUTO_ATE_2500;
        } else {
            contribuicaoSindicato = salarioBruto * DESCONTO_SINDICATO;
            fgts = salarioBruto * TAXA_FGTS;
            descontoIr = salarioBruto * FATOR_SALARIO_BRUTO_ACIMA_2500;
        }

        System.out.println("Salario Bruto:" + salarioBruto);
        System.out.println("Salario Liquido:" + (salarioBruto - contribuicaoSindicato - descontoIr));
        System.out.println("Desconto IR:" + descontoIr);
        System.out.println("Desconto Sindicato:" + contribuicaoSindicato);
        System.out.println("FGTS:" + fgts);

    }
}



