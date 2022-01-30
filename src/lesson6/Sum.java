package lesson6;

import java.util.Scanner;
//+
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEvenNum = 0;
        int sumNotEvenNum = 0;
        int num = 0;
        System.out.println("Введите до какого числа проводить расчет");
        int lim = scanner.nextInt();

        while (num < lim) {
            num += 1;
            if (num % 2 == 0) {
                sumEvenNum += num;
            } else {
                sumNotEvenNum += num;
            }
        }
        System.out.println("Сумма четных чисел " + sumEvenNum);
        System.out.println("Сумма нечетных чисел " + sumNotEvenNum);
        System.out.println("Общая сумма " + (sumEvenNum + sumNotEvenNum));
    }
}
