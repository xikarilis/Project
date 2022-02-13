package lesson10;

import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] anArray = new int[size];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(20);
        }
        System.out.println("enter 1");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + "\t");
        }
        for (int i = anArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (anArray[i] > anArray[j]) {
                    int tmp = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println(" enter 2");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + "\t");
        }
        System.out.println();
        System.out.println("max sum " + (anArray[0] + anArray[1]));
        System.out.println("min subtraction " + (anArray[anArray.length - 1] - anArray[anArray.length - 2]));
    }
}
