package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 3;
        int[] array = new int[ARRAY_SIZE];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.print(Arrays.toString(array) + '\n');
        System.out.println("sum: " + sum);
    }
}
