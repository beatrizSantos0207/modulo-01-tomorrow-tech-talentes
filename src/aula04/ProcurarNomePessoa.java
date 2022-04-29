package aula04;

import java.util.Scanner;

public class ProcurarNomePessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = {"Ana", "Lucas", "Pedro", "Beatriz", "Hugo", "Abraao", "Gabriela", "Yara",
                "Isaac", "Emanuel"};

        System.out.println("Digite o nome que deseja encontrar:");
        String nomeEntrada = entrada.nextLine();
        boolean isNomeNaoEncontrado = true;

        for (String nomeProcurado : nomes) {
            if (nomeEntrada.equals(nomeProcurado)) {
                isNomeNaoEncontrado = false;
                System.out.println("ACHEI");
                break;
            }
        }

        if (isNomeNaoEncontrado) {
            System.out.println("NÃO ACHEI");
        }

    }
}