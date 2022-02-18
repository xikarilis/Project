package lesson10;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int userNumber = scanner.nextInt();
        int matchesCount = 0;
        for (int number : numbers) {
            if (number > 0 && number % userNumber == 0) {
                matchesCount++;
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("number of matches: " + matchesCount);
    }
}
