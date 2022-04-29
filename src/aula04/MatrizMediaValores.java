package aula04;

public class MatrizMediaValores {
    public static void main(String[] args) {
        int[][] matriz = {{34, 24, 56}, {34, 25, 67}, {78, 35, 21}};
        int linha = 2;
        int total = 0;
        for (int j = 0; j < 3; j++) {
            total += matriz[linha][j];
        }
        double media = (double) total / matriz.length;
        System.out.printf("%.2f", media);
    }


}
