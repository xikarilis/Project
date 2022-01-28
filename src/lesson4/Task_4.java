package lesson4;

public class Task_4 {
    public static void main(String[] args) {
        int sumEvenNum = 0;
        int sumNotEvenNum = 0;
        int num = 0;

        while (num < 100) {
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

