package lesson2;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner scCalculator_1 = new Scanner(System.in);
        System.out.println("enter 2 number");
        Double firstNum = scCalculator_1.nextDouble();
        Double secondNum = scCalculator_1.nextDouble();

        System.out.println("'1' - Sum \n'2' - Division\n'3' - Difference\n'4' - Multiplication");
        char operation = scCalculator_1.next().charAt(0);
        if (operation == '1') {
            System.out.println(firstNum + secondNum);
        } else if (operation == '2' & secondNum != 0) {
            System.out.println(firstNum / secondNum);
        } else if (operation == '2' & secondNum == 0) {
            System.out.println("it cannot be divided by 0");
        } else if (operation == '3') {
            System.out.println(firstNum - secondNum);
        } else if (operation == '4') {
            System.out.println(firstNum * secondNum);
        } else {
            System.out.println("error");
        }
    }
}
