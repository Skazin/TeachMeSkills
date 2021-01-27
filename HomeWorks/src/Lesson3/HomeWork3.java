package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(operation(-1));
        foobar(6);
        foobar(10);
        foobar(15);
        foobar(16);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method performs some operation with transmitted int number based on some conditions:
     *  - if number is positive - increase it by 1
     *  - if number is negative - decrease it by 2
     *  - if number is equal to zero - replace it with 10
     * @param number transmitted number
     * @return number value after operation
     */
    public static int operation(int number) {
        if(number > 0) ++number;
        else if (number < 0) number += 2;
        else number = 10;
        return number;
    }

    /**
     * Method prints different strings in console based on some conditions:
     *  - if remainder of the division number by 3 is zero - print "foo"
     *  - if remainder of the division number by 5 is zero - print "bar"
     *  - if remainder of the division number by both 3 and 5 is zero - print "foobar"
     *  - if remainder of the division number by any of 3 or 5 isn't zero - print "Please choose new number"
     * @param number transmitted number
     */
    public static void foobar(int number) {
        if (number % 3 == 0){
            if (number % 5 == 0) System.out.println("foobar");
            else System.out.println("foo");
        }
        else if (number % 5 == 0) System.out.println("bar");
        else System.out.println("Please choose new number");
    }

    /**
     * Method creates new 2-dimensional array with two ints which you enter from console as heigth and width of this array
     * Than it fills array with random values (under 100)
     * And prints in console matrix with given size, but:
     *    - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     *    - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     *    - Print "*" otherwise
     */
    public static void printMatrix() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Необходимо ввести размеры двумерного массива.");
        System.out.print("Введите высоту массива: ");
        int height = in.nextInt();
        System.out.print("Введите ширину массива: ");
        int width = in.nextInt();
        int[][] arr = new int[height][width];
        for (int i = 0; i < height; i++) {                          // наполняем массив рандомными интами
            for (int j = 0; j < width; j++) {
                arr[i][j] = random.nextInt(100);
            }

        }
        for (int i = 0; i < height; i++) {                          // обрабатываем массив и формируем матрицу
            for (int j = 0; j < width; j++) {
                if (arr[i][j] % 3 == 0) System.out.print(" + ");
                else if (arr[i][j] % 7 == 0) System.out.print(" - ");
                else System.out.print(" * ");
            }
            System.out.println("");
        }

    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {
        System.out.println("Простые числа от 0 до 1000: ");
        int currentNumber;
        int dividers;
        for (currentNumber = 1; currentNumber < 1000; currentNumber++) {
            dividers = 0;
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <= 2)
                System.out.println(currentNumber);
        }
    }
}


