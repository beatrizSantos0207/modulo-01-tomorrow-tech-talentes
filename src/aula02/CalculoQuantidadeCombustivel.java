package aula02;

import java.util.Scanner;

public class CalculoQuantidadeCombustivel {

    public static final int FATOR_KM_POR_LITRO = 12;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a velocidade média:");
        double velocidade = entrada.nextDouble();
        System.out.println("Digite o tempo gasto na viagem:");
        double tempo = entrada.nextDouble();
        double distancia = tempo*velocidade;
        double litrosUsados = distancia/ FATOR_KM_POR_LITRO;
        System.out.printf("A quantidade de combustivel utilizados nesse viagem foi de %.2f l/km" ,litrosUsados);
    }
}
