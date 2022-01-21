package lesson2;

import java.util.Scanner;

public class Сalculator_2 {
    public static void main(String[] args) {
        Scanner scCalculator = new Scanner(System.in);
        System.out.println("enter 2 number");
        Double firstNum = scCalculator.nextDouble();
        Double secondNum = scCalculator.nextDouble();

        System.out.println("'+' - Sum \n"
                + "'/' - Division\n"
                + "'-' - Difference\n"
                + "'*' - Multiplication");
        char operation = scCalculator.next().charAt(0);
        if (operation == '+') {
            System.out.println(firstNum + secondNum);
        }else if (operation == '/' & secondNum != 0) {
            System.out.println(firstNum / secondNum);
        }else if (operation == '/' & secondNum == 0){
            System.out.println("it cannot be divided by 0");
        }else if (operation == '-'){
            System.out.println(firstNum - secondNum);
        }else if (operation == '*') {
            System.out.println(firstNum * secondNum);
        }else {
            System.out.println("error");
        }
    }
}
