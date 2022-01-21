package lesson2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scTask_5 = new Scanner(System.in);
        System.out.println("enter the month number from 1 to 12");
        int month = scTask_5.nextInt();
            switch (month){
         case 12, 1, 2 :
             System.out.println("winter");
             break;
         case 3, 4, 5 :
             System.out.println("spring");
             break;
         case 6, 7, 8 :
             System.out.println("summer");
             break;
         case 9, 10, 11 :
             System.out.println("autumn");
             break;
     }
    }
}
