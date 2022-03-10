package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int size = scanner.nextInt();
        String[] array = new String[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(array));

        String[] arrayInverter = new String[size];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arrayInverter[i] = array[j];
        }
        System.out.println(Arrays.toString(arrayInverter));


    }
}
