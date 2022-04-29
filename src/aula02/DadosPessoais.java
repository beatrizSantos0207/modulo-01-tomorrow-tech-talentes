package aula02;

import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = scan.nextLine();
        System.out.println("Digite seu nome endereço:");
        String endereco = scan.nextLine();
        System.out.println("Digite seu cep: ");
        int cep = scan.nextInt();
        System.out.println("Telefone: ");
        int telefone = scan.nextInt();
        System.out.println("Cep: "+ cep);
        System.out.println( "Telefone: " + telefone);

        System.out.println("Os dados comepletos são\nNome: "+nome + "\n endereço: " + endereco
        + "\n CEP " + cep + " e telefone: " + telefone);

    }
}
