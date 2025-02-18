import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] peopleAge = new int[10];

        for (int i = 0; i < peopleAge.length; i++) {
            peopleAge[i] = new Random().nextInt(100);
        }

        double sumOfAge = 0;

        for (int i = 0; i < peopleAge.length; i++) {
            sumOfAge += peopleAge[i];
        }

        double averageAge = sumOfAge / peopleAge.length;

        System.out.println("Результат: " + averageAge);

    }
}
