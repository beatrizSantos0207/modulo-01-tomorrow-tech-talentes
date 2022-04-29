package aula04;

import java.util.Scanner;

public class GabaritoProva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] gabarito = {'b', 'e', 'a', 'c', 'c', 'd', 'b', 'd', 'b', 'e'};
        char[] respostasAluno = new char[10];
        int acertos = 0;


        for (int j = 0; j < respostasAluno.length; j++) {
            System.out.printf("Digite a respota da questão nº %d:", (j + 1));
            respostasAluno[j] = scan.next().charAt(0);

            if (gabarito[j] == respostasAluno[j]) {
                acertos++;

            }
        }
            if (acertos >= 6) {
                System.out.printf("A nota é: %d e o aluno foi aprovado.", acertos);
            } else {
                System.out.printf("A nota é: %d e o aluno foi reprovado.", acertos);

            }
        }

    }




