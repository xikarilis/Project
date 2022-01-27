package lesson3;

public class Task_3 {
    public static void main(String[] args) {
        float inch;
        double centimetre;
        for (inch = 1, centimetre = 0; inch <= 20; inch++) {
            centimetre += 2.54;
            System.out.println();
            System.out.println(inch + " Дюймов " + centimetre + " Сантиметров");
        }

    }
}
