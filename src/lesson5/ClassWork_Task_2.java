package lesson5;

import java.util.Scanner;

public class ClassWork_Task_2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        String myString = scanner.next();
        StringBuilder buf = new StringBuilder(myString);
        buf.reverse();
        String data = buf.toString();
        if (myString.equals(data)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

