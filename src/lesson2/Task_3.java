package lesson2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scTask_3 = new Scanner(System.in);
        int week = scTask_3.nextInt();
        if (week == 1){
            System.out.println("monday");
        }else if (week == 2) {
            System.out.println("tuesday");
        }else if (week == 3){
            System.out.println("wednesday");
        }else if (week == 4){
            System.out.println("thursday");
        }else if (week == 5){
            System.out.println("friday");
        }else if (week == 6){
            System.out.println("saturday");
        }else if (week == 7){
            System.out.println("sunday");
        }else {
            System.out.println("there is no such day");
        }
    }
}

