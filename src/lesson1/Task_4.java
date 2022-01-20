package lesson1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scTask_4 = new Scanner(System.in);
        System.out.println("Введите 2 целых числа :");
        int firstNumber = scTask_4.nextInt();
        int secondNumber = scTask_4.nextInt();
        System.out.println("Введите строку");
        String line = scTask_4.next();
        System.out.println("Введите 1 дробное число :");
        double fractionalNumber = scTask_4.nextDouble();
        System.out.print(line + " ");
        System.out.println(firstNumber+secondNumber+fractionalNumber);

    }
}
