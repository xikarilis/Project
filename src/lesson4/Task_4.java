package lesson4;

public class Task_4 {
    public static void main(String[] args) {
        double evenNumbers = 0;
        double notEvenNumbers = 1;
        double sumEvenNum = 0;
        double sumNotEvenNum = 0;
        do {
            sumEvenNum += evenNumbers;
            evenNumbers += 2;
        } while (evenNumbers < 100 & evenNumbers % 2 == 0);
        System.out.println("Сумма четных чисел " + sumEvenNum);

        do {
            sumNotEvenNum += notEvenNumbers;
            notEvenNumbers += 2;
        } while (notEvenNumbers <= 99 & notEvenNumbers % 2 != 0);
        System.out.println("Сумма нечетных чисел " + sumNotEvenNum);
        //
        System.out.println("Общая сумма" + (sumEvenNum + sumNotEvenNum));
    }
}

