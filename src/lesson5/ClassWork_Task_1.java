package lesson5;

import java.util.Random;
import java.util.Scanner;

public class ClassWork_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        Random random = new Random();
        int r = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("random number " + r);
        if (num == r) {
            System.out.println("x");
        } else if (num > r) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }

    }
}
