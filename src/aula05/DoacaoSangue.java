package aula05;

import java.util.Scanner;

public class DoacaoSangue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do doador:");
        int idade = entrada.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar.");

        } else {
            System.out.println("Agradecemos seu interesse, mas infelizmente você não esta apto para doação.");

        }
    }
}
