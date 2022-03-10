package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.print(Arrays.toString(array) + '\n');
        System.out.println("arithmetic mean: " + sum/ array.length);
    }
}
