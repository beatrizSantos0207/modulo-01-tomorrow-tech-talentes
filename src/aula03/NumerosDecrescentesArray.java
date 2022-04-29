package aula03;

public class NumerosDecrescentesArray {
    public static void main(String[] args) {
        int[] numeros = {4, 9, 10, 29, 5};

        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] > numeros[j]) {
                    int arrayAux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = arrayAux;
                }

            }
        }

        System.out.println("Array em ordem decrescente:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}


