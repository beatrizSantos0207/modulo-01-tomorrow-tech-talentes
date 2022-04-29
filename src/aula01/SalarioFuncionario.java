package aula01;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do salario:");
        double salario = sc.nextDouble();
        double reajusteSalarial = 0.07 * salario;
        System.out.println("O salário anterior era de R$:" + salario);
        System.out.println("O salário após ajuste é de R$:" + (reajusteSalarial + salario));
    }
}
