package aula03;

import java.util.Scanner;

public class InformacoesPessoais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo = "";
        String estadoCivil = "";
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        validator(nome.length() < 3,
                "O nome digitado tem menos de 3 caracteres.",
                "Nome:" + nome);

        System.out.println("Digite a idade:");
        int idade = entrada.nextInt();
        validator(idade < 0 || idade > 150,
                "Idade inválida",
                "Idade:" + idade);

        System.out.println("Digite o valor do salario");
        double salario = entrada.nextDouble();
        validator(salario < 0, "O salário não pode ser " +
                "inferior a zero.", "Salário:" + salario);
        entrada.nextLine();

        System.out.println("Digite o sexo f ou m :");
        sexo = entrada.nextLine();
        validator(!sexo.equals("m") && !sexo.equals("f"), "Formato de sexo diferente do " +
                "solicitado ou inexistente.", "Sexo:" + sexo);
        System.out.println("Digite o estado civil:");
        validator(!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v")
                && !estadoCivil.equals("d"), "Formato do estado civil diferente " +
                "do solicitado ou inexistente", "Estado civil:" + estadoCivil);


    }

    private static void validator(boolean condicao, String respostaIncorreta, String respostaCorreta) {
        if (condicao) {
            System.out.println(respostaIncorreta);
        } else {
            System.out.println(respostaCorreta);
        }
    }

}
