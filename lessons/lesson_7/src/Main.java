import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*boolean isContinue = true;
        do {
            System.out.println("Hello");
            System.out.println("Continue? (1/0)");
            int userInput = new Scanner(System.in).nextInt();
            if (userInput == 0) {
                isContinue = false;
            }
        } while (isContinue);*/

        boolean isContinue = true;

        int x = 0;
        int y = 0;

        String infoAboutX = "Позвиция робота по оси x: ";
        String infoAboutY = "Позвиция робота по оси y: ";

        while (isContinue) {
            System.out.println("Выберите куда двинуться: \n" +
                    "0. Завершить\n" +
                    "1. Вверх\n" +
                    "2. Вниз\n" +
                    "3. Ввправо\n" +
                    "4. Влево");

            int userInput = new Scanner(System.in).nextInt();

            if (userInput == 0) {
                isContinue = false;
            } else if (userInput == 1) {
                y += 1;
                System.out.println(infoAboutX + x);
                System.out.println(infoAboutY + y);
                System.out.println();
            } else if (userInput == 2) {
                y -= 1;
                System.out.println(infoAboutX + x);
                System.out.println(infoAboutY + y);
                System.out.println();
            } else if (userInput == 3) {
                x += 1;
                System.out.println(infoAboutX + x);
                System.out.println(infoAboutY + y);
                System.out.println();
            } else if (userInput == 4) {
                x -= 1;
                System.out.println(infoAboutX + x);
                System.out.println(infoAboutY + y);
                System.out.println();
            } else {
                System.out.println("Error! Invalid value!");
                isContinue = false;
            }
        }
    }
}
