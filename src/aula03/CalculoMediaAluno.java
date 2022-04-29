package aula03;

import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] notas = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            notas[i] = scan.nextInt();
            media = notas[i]/4;
        } if (media<=7){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno de recuperação!");
        }
    }
}
