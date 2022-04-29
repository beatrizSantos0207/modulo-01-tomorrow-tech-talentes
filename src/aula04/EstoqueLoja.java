package aula04;

import java.util.Scanner;

public class EstoqueLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorTotalEstoque = 0;
        double valorTotalMercadorias = 0;

        System.out.println("Digite a quantidade de produtos que deseja cadastrar:");
        int quantidadeProdutos = entrada.nextInt();
        for (int i = 0; i < quantidadeProdutos; i++) {
            entrada.nextLine();
            System.out.printf("Digite o nome do º %d produto: ", (i + 1));
            String nomeProduto = entrada.nextLine();
            System.out.println("Digite número total de mercadorias no estoque: ");
            int quantidadeMercadoria = entrada.nextInt();
            System.out.println("Digite o valor unitário da mercadoria:");
            double valorUnitarioMercadoria = entrada.nextDouble();
            valorTotalEstoque += valorUnitarioMercadoria * quantidadeMercadoria;
            valorTotalMercadorias += valorUnitarioMercadoria;

        }

        System.out.println(valorTotalEstoque);
        System.out.println("A média é:" + valorTotalMercadorias / quantidadeProdutos);


    }
}
