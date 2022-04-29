package aula01;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        double celsius = 20;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        double rankine = celsius * 1.8 + 32 + 459.67;
        double reaumur = celsius * 0.8;

        System.out.println("A temperatura em Celsius é:" + celsius);
        System.out.println("A temperatura em Fahrenheit é:" + fahrenheit);
        System.out.println("A temperatura em Kelvin é:" + kelvin);
        System.out.printf("A temperatura em Rankine é: %.2f \n" , rankine );
        System.out.println("A temperatura em Reamur:" + reaumur);


    }
}
