package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("enter the array elements");
        int i = 0;
        do {
            array[i] = scanner.nextInt();
            i++;
        }
        while (i < array.length);
        System.out.print(Arrays.toString(array) + '\n');
        System.out.println("enter number");
        int number = scanner.nextInt();
        boolean coincidence = false;
        int j = 0;
        do {
            if (array[j] == number) {
                coincidence = true;
                break;
            }
            j++;
        } while (j < array.length);
        String result = coincidence ? "yes" : "no";
        System.out.println(result);
    }
}
