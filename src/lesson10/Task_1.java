package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int counterEvenNum = 0;
        int counterOddNum = 0;
        int[][] numbers = new int[size][size];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(numbers[i]));
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    counterEvenNum++;
                } else {
                    counterOddNum++;
                }
            }
        }
        int[] even = new int[counterEvenNum];
        int[] odd = new int[counterOddNum];
        counterEvenNum = 0;
        counterOddNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even[counterEvenNum] = numbers[i][j];
                    counterEvenNum++;
                } else {
                    odd[counterOddNum] = numbers[i][j];
                    counterOddNum++;
                }
            }
        }
        System.out.println("even" + Arrays.toString(even));
        System.out.println("odd" + Arrays.toString(odd));
    }
}
