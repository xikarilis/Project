package lesson3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width_1 = scanner.nextInt(); // ввести 4
        int height_1 = scanner.nextInt();// ввести -4

        for (; height_1 <= -1; height_1++) {
            for (int j = width_1; height_1 >= -j & j != height_1; j--) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
        System.out.println('\n');
        for (; width_1 >= 0; width_1--) {
            for (int j = 1; j <= width_1; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }

    }
}



