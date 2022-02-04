package lesson6;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exit;
        do {
            System.out.println("enter number");
            double firstNum = scanner.nextDouble();
            double secondNum = scanner.nextDouble();
            System.out.println(" + - сложить\n - - вычесть\n * - умножить\n / - разделить \n");
            char operation = scanner.next().charAt(0);
            if (operation == '+') {
                System.out.println(firstNum + secondNum);
            } else if (operation == '/' & secondNum != 0) {
                System.out.println(firstNum / secondNum);
            } else if (operation == '/' & secondNum == 0) {
                System.out.println("it cannot be divided by 0");
            } else if (operation == '-') {
                double result = firstNum - secondNum;
                System.out.println(result);
            } else if (operation == '*') {
                System.out.println(firstNum * secondNum);
            } else {
                System.out.println("error");
            }
            System.out.println("Хотите продолжить? yes / no");
            exit = scanner.next();
            if (Objects.equals(exit, "yes")) {
            } else if (Objects.equals(exit, "no")) {
                break;
            } else {
                System.out.println("eror");
                break;
            }
        } while (exit != "no");
    }
}

