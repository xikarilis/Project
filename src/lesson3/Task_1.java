package lesson3;

public class Task_1 {
    public static void main(String[] args) {
        for (int amoeba = 1, time = 0; time <= 24; time += 3) {
            System.out.println(amoeba *=2);
        }
    }
}
