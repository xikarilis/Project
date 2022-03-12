package lesson15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//https://www.youtube.com/watch?v=aLW-zyszeqM
public class Exam_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Shoose array to work with:");
        System.out.println("1: numbers\n2: strings");
        int choiceTypeArray = scanner.nextInt();
        if (choiceTypeArray == 1) {
            System.out.println("How do you want to initialize array?");
            System.out.println("1: from console\n2: random numbers");
            int choiceTypeInit = scanner.nextInt();
            System.out.println("Enter length");
            int[] numbers = new int[initSize(scanner)];
            if (choiceTypeInit == 1) {
                int[] initArray = initScannerArray(scanner, numbers);
                outputNumbers(initArray);
            } else if (choiceTypeInit == 2) {
                int[] initArray = initRandomArray(random, numbers);
                outputNumbers(initArray);
            } else {
                System.out.println("error");
            }
            System.out.println("min:" + determinationMin(numbers));
            System.out.println("max:" + determinationMax(numbers));

            System.out.println("enter number whose index you want to find:");
            int userNum = initUserNum(scanner);
            System.out.println("Index: " + searchCoincidence(numbers,userNum));
            sortedArray(numbers);
            System.out.println("sorted array: " + Arrays.toString(numbers));
        } else if (choiceTypeArray == 2) {
        } else {
            System.out.println("error");
        }
    }

    static int initSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("error. Try again");
            initSize(scanner);
        }
        return size;
    }

    static int[] initScannerArray(Scanner scanner, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;

    }

    static int[] initRandomArray(Random random, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        return numbers;
    }

    static void outputNumbers(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    static int determinationMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    static int determinationMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int initUserNum(Scanner scanner) {
        int userNum = scanner.nextInt();
        return userNum;
    }


    static int searchCoincidence(int[] numbers, int userNum) {

        int index = 0;
        for (int number : numbers) {
            if (number == userNum) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    static void sortedArray(int[] numbers) {
        int tmp;
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }

    }


}




