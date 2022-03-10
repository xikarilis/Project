package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array) + '\n');
    }
}
