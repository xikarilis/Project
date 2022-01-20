package lesson2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scTask_2 = new Scanner(System.in);
        double firstNumber = scTask_2.nextDouble();
        double secondNumber = scTask_2.nextDouble();
        if (firstNumber%secondNumber == 0){
            System.out.println("кратное");
        }else {
            System.out.println("не кратное");
        }
    }
}
