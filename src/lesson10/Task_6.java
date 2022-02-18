package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        int[] firstArray = new int[size / 2];
        int[] secondArray = new int[size - firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = numbers[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = numbers[firstArray.length + i];
        }
        System.out.println("firstArray " + Arrays.toString(firstArray));
        System.out.println("secondArray " + Arrays.toString(secondArray));
    }
}
