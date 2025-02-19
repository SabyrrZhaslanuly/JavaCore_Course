import java.util.Scanner;

public class Main {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            int userInput = inputCommand();
            if (userInput == 1) {
                y += inputSteps();
            } else if (userInput == 2) {
                y -= inputSteps();
            } else if (userInput == 3) {
                x += inputSteps();
            } else if (userInput == 4) {
                x -= inputSteps();
            } else if (userInput == 5) {
                currentCoordinates();
            } else {
                errorMessage();
            }
        }
    }

    public static int inputCommand() {
        System.out.print("""
                Выберите куда двинуться:\s
                1. Вверх
                2. Вниз
                3. Ввправо
                4. Влево
                5. Узнать текущие координаты
                ->\s""");

        return new Scanner(System.in).nextInt();
    }

    public static int inputSteps() {
        System.out.print("Введите кол-во шагов: ");
        return new Scanner(System.in).nextInt();
    }

    private static void currentCoordinates() {
        System.out.println("Текущие координаты: x = " + x + ", y = " + y);
    }

    private static void errorMessage() {
        System.out.println("Error! Invalid value!");
    }
}
