package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                System.out.println("error, number < 0");
                return;
            }
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
