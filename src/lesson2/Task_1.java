package lesson2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scTask_1 = new Scanner(System.in);
        System.out.println("enter three numbers");
        int firstNumber = scTask_1.nextInt();
        int secondNumber = scTask_1.nextInt();
        int thirdNumber = scTask_1.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("first number " + firstNumber);
        if (secondNumber > thirdNumber)
            System.out.println("second number " + secondNumber);
        if (thirdNumber>secondNumber)
            System.out.println("");
        }
    }
}
