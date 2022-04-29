package aula03;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        int[] idades = new int[10];
        Scanner sc = new Scanner(System.in);
        int contador = 0;


        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            idades[i] = sc.nextInt();
            if (idades[i] > 18) {
                contador++;
            }
        }

        System.out.println(contador +" pessoas tem mais de 18 anos.");

    }


    }
