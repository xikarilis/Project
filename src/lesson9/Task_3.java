package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter size array");
        int size = scanner.nextInt();
        int[][] myArray = new int[size][size];
        System.out.println("enter numbers");
        int number = scanner.nextInt();
        boolean isNumberInArray = false;
        int line = 0;
        int colum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = random.nextInt(4);

                if (myArray[i][j] == number) {
                    isNumberInArray = true;
                    line = i;
                    colum = j;
                    break;
                }
            }
            System.out.println(Arrays.toString(myArray[i]));
        }
        String result = isNumberInArray ? "line: " + line + " colum: " + colum : "there is no number";
        System.out.println(result);
    }
}
