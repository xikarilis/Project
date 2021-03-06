package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        int tmp;
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("min: " + numbers[0] + " max: " + numbers[numbers.length - 1]);
    }
}
