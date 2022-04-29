package aula05;

import java.util.Arrays;
import java.util.Scanner;

public class AgendaContatos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de contatos para a sua agenda: ");
        int entrada = scan.nextInt();
        inicializarAgenda(entrada);

    }

    private static void inicializarAgenda(int quantidadePessoasAgenda) {

        String[][] dadosPessoais = new String[quantidadePessoasAgenda][3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < quantidadePessoasAgenda; i++) {

            System.out.println("Digite o codigo da "+ (i+1) +" pessoa");
            dadosPessoais[i][0] = String.valueOf(scan.nextInt());
            System.out.println("Digite o número do telefone:");
            dadosPessoais[i][1] = String.valueOf(scan.nextInt());
            System.out.println("Digite a idade");
            dadosPessoais[i][2] = String.valueOf(scan.nextInt());
        }

        System.out.println("A sua agenda é:\n" + Arrays.deepToString(dadosPessoais));

        gerenciarAgenda(dadosPessoais);
    }

    private static void gerenciarAgenda(String[][] dadosPessoais) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das opções:\n(1)adicionar novo contato \n(2)remover contato");
        int entrada = scan.nextInt();
        switch (entrada) {
            case 1:
                adicionarContato(dadosPessoais);
                break;
            case 2:
                removerContato(dadosPessoais);
                System.out.println("Contato excluido");
                break;
            default:
                System.out.println("Opção não cadastrada.");


        }
    }

    private static void adicionarContato(String[][] dadosPessoais) {
        Scanner scan = new Scanner(System.in);

        String[][] novaAgenda = new String[dadosPessoais.length + 1][3];

        for (int i = 0; i < dadosPessoais.length; i++) {
            novaAgenda[i][0] = dadosPessoais[i][0];
            novaAgenda[i][1] = dadosPessoais[i][1];
            novaAgenda[i][2] = dadosPessoais[i][2];
        }

        System.out.println("Digite o codigo da pessoa");
        novaAgenda[dadosPessoais.length][0] = String.valueOf(scan.nextInt());
        System.out.println("Digite o número do telefone:");
        novaAgenda[dadosPessoais.length][1] = String.valueOf(scan.nextInt());
        System.out.println("Digite a idade");
        novaAgenda[dadosPessoais.length][2] = String.valueOf(scan.nextInt());

        System.out.println(Arrays.deepToString(novaAgenda));
    }

    private static void removerContato(String[][] dadosPessoais) {
        Scanner scan = new Scanner(System.in);
        String[][] novaAgenda = new String[dadosPessoais.length][3];

        System.out.println("Digite o código da pessoa que deseja remover: ");
        String codigo = String.valueOf(scan.nextInt());

        for (int i = 0; i < dadosPessoais.length; i++) {
            if (!dadosPessoais[i][0].equals(codigo)) {
                novaAgenda[i][0] = dadosPessoais[i][0];
                novaAgenda[i][1] = dadosPessoais[i][1];
                novaAgenda[i][2] = dadosPessoais[i][2];
            }
        }

        System.out.println(Arrays.deepToString(novaAgenda));
    }
}
