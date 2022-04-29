package aula04;

import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {

        final double BASE_COMISSAO_1500 = 1500;
        final double FATOR_COMISSAO_3 = 0.03;
        final double FATOR_COMISSAO_5 = 0.05;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do vendedor:");
        double salario = entrada.nextDouble();
        System.out.println("Digite o valor de vendas efetuadas:");
        double totalVendas = entrada.nextDouble();

        if (totalVendas <= 1500) {
            salario = (totalVendas * FATOR_COMISSAO_3) + salario;
            System.out.println("O salário do vendedor é salário R$:" + salario);

        } else {
            salario = (BASE_COMISSAO_1500 * FATOR_COMISSAO_3) + ((totalVendas - BASE_COMISSAO_1500)
                    * FATOR_COMISSAO_5) + salario;
            System.out.println("O salário do vendedor é salário R$:" + salario);

        }

    }
}
