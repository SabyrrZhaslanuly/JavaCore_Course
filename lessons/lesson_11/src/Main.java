public class Main {
    public static void main(String[] args) {

        Human vasya = new Human(18, "Вася", "m");

        System.out.println(vasya.age);
        System.out.println(vasya.name);
        System.out.println(vasya.gender);

        Human masha = new Human(17, "Маша", "f");

        System.out.println(masha.age);
        System.out.println(masha.name);
        System.out.println(masha.gender);

    }
}
