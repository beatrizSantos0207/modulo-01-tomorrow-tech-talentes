package aula01;

public class EmprestimoJurosCompostos {
    public static void main(String[] args) {
        double valorEmprestado= 3000;
        double taxaJuros= 0.02;
        double tempo  = 12;
        double valorPagar = valorEmprestado * Math.pow(1+taxaJuros, tempo);

        System.out.printf("O valor a pagar  %.2f %n", valorPagar);

    }
}
