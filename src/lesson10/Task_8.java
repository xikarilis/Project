package lesson10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        int numberToRemove = scanner.nextInt();
        int[] remove =new int[numbers.length-1];
        int counter=0;
        for (int num:numbers) {
            if (num!=numberToRemove){
                remove[counter] =num;
                counter++;
            }
        }
        System.out.println(Arrays.toString(remove));
    }
}
