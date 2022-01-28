package lesson4;

public class Task_1 {
    public static void main(String[] args) {
        int evenNumbers = 1;
        int i = 1;
        do {
            i *= 2;
//            System.out.println(i);
            evenNumbers += i;
        } while (i < 256);
        System.out.println(evenNumbers);
    }
}
