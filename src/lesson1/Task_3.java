package lesson1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scTask_3 = new Scanner(System.in);
        System.out.println("Введите х");
        int x = scTask_3.nextInt();
        System.out.println("Введите у");
        int y = scTask_3.nextInt();
        int result = 4*x+2*y;
        System.out.println("result = " + result);
    }
}
