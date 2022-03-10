package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] arrayNum = new int[size];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arrayNum));
        int counter = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        int[] arrayEvenNum = new int[counter];
        for (int i = 0, j = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                arrayEvenNum[j] = arrayNum[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrayEvenNum));
    }
}
