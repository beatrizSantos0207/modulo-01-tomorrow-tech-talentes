package aula02;

public class NotasAlunosSaida {
    public static void main(String[] args) {
        String[][] nomesNotas = {{"ALUNO(A)","=========","Aline", "Mario", "Sergio", "Shirley"},
                {"NOTA","=======","9.0", "DEZ", "4.5","7.0"}};

        for (int i = 0; i < nomesNotas[0].length; i++) {
            String nome = nomesNotas[0][i];
            String nota = nomesNotas[1][i];
            System.out.printf("%s   %s\n", nome, nota);
        }

    }
}

