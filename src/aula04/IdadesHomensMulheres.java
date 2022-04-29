package aula04;

import java.util.Scanner;

public class IdadesHomensMulheres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] idadesMulher = new int[2];
        int[] idadesHomem = new int[2];
        int idadeMulherMaisNova = Integer.MIN_VALUE;
        int idadeMulherMaisVelha = 0;
        int idadeHomemMaisNovo = Integer.MIN_VALUE;
        int idadeHomemMaisVelho = 0;



        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite a idade da %dª mulher:", (i + 1));
            idadesMulher[i] = entrada.nextInt();
            System.out.printf("Digite a do %d º homem:", (i + 1));
            idadesHomem[i] = entrada.nextInt();

        }
        for (int i = 0; i < idadesMulher.length; i++) {
            if (idadesMulher[i] > idadeMulherMaisVelha) {
                idadeMulherMaisVelha = idadesMulher[i];
            }
            if(idadesMulher[i] < idadeMulherMaisNova){
                idadeMulherMaisNova = idadesMulher[i];
            }
        }
        for (int i = 0; i < idadesHomem.length; i++) {
            if (idadesHomem[i] > idadeHomemMaisVelho) {
                idadeHomemMaisVelho = idadesHomem[i];
            }
            if(idadesHomem[i] < idadeHomemMaisNovo){
                idadeHomemMaisNovo = idadesHomem[i];
            }

        }

        System.out.printf("A soma de idade da mulher mais nova com o homem mais velho é: %d \n",
                    (idadeMulherMaisNova+ idadeHomemMaisVelho));
            System.out.printf("O produto das idades da mulher mais velha e do homem mais novo é: %d \n",
                    (idadeMulherMaisVelha - idadeHomemMaisNovo));
        }
    }


