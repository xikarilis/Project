package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] anArray = new int[size];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(anArray));
        int tmp;
        for (int i = anArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (anArray[i] < anArray[j]) {
                    tmp = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(anArray));
        System.out.println("max sum " + (anArray[anArray.length - 1] + anArray[anArray.length - 2]));
        System.out.println("min subtraction " + (anArray[0] - anArray[anArray.length - 1]));
    }
}
