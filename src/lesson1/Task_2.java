package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scTask_2 = new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNum = scTask_2.nextInt();
        System.out.println("enter the second number");
        int secondNum = scTask_2.nextInt();
        boolean comparison = firstNum>secondNum;
        System.out.println("comparison = " + comparison);
    }
}
