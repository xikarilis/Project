package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter size array");
        int size = scanner.nextInt();
        int[][] myArray = new int[size][size];
        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(myArray[i]));
        }
        for (int i = 0; i < myArray.length; i++) {
            result += myArray[i][i];
        }
        System.out.println(result);
    }
}
