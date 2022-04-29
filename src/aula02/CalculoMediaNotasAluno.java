package aula02;

import java.util.Scanner;

public class CalculoMediaNotasAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("Insira a turma: ");
        String turma = scan.nextLine();
        System.out.println("Insira a nota do aluno em Português:");
        double notaPortugues = scan.nextDouble();
        System.out.println("Insira a nota do aluno em Matemática:");
        double notaMatematica = scan.nextDouble();
        System.out.println("Insira a nota do aluno em História:");
        double notaHistoria = scan.nextDouble();

        double mediaNotas = (notaPortugues + notaMatematica + notaHistoria)/3;


        System.out.printf("%s da turma %s obteve um media final de %.2f  ",nome,turma, mediaNotas);
    }
}
