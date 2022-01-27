package lesson3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scTask_2 = new Scanner(System.in);

        int a = scTask_2.nextInt();
        int b = scTask_2.nextInt();
        int sum = 0;
        for (int i = 0; i <= b; ) {
            i += 1;
            sum += a;
            if (i == b) {
                System.out.println(sum);
            }

        }
    }
}
