package lesson1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scTask_1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = scTask_1.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scTask_1.nextInt();
        System.out.println("Среднее арифметическое:" + (firstNum+secondNum)/2);
    }
}
