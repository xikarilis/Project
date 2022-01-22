package lesson2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scTask_4 = new Scanner(System.in);

        int week = scTask_4.nextInt();
        switch (week) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("there is no such day");
                break;
        }
    }
}
