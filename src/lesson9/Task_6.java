package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter size array");
        int size = scanner.nextInt();
        int sizeInternalArrays = 0;
        int[][] jaggedArray;
        int[] myArray;
        int line=0;
        for (int i = 0; i < size; i++) {
            System.out.println("size internal arrays");
            sizeInternalArrays = scanner.nextInt();
            myArray = new int[sizeInternalArrays];
            for (int j = 0; j < sizeInternalArrays; j++) {
                myArray[j] = random.nextInt(20);
              line= myArray.length;
            }
        }
        jaggedArray = new int[size][line];
        for (int k = 0; k < size; k++) {
            jaggedArray[k] =myArray;
            System.out.println(Arrays.deepToString(jaggedArray));
        }
    }
}
