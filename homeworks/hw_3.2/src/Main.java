import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество рублей: ");
        int rubles = scanner.nextInt();

        System.out.print("Введите курс доллара: ");
        double dollarRate = scanner.nextDouble();

        System.out.print("Введите курс евро: ");
        double euroRate = scanner.nextDouble();

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.println("Результат в долларах: " + dollars);
        System.out.println("Результат в евро: " + euros);

    }
}
