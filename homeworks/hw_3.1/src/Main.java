import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите температуру в Цельсия: ");
        double tempCelsius = new Scanner(System.in).nextDouble();

        final double COEFFICIENT1 = 1.8;
        final int COEFFICIENT2 = 32;

        double calcToFahrenheit = tempCelsius * COEFFICIENT1 + COEFFICIENT2;

        System.out.println("Результат в Фарингейтах: " + calcToFahrenheit);

    }
}
