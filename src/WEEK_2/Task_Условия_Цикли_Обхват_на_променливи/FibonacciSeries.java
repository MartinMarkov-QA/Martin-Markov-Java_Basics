package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  7. FibonacciSeries
 *  Направете програма, която отпечатва първите n числа от серията на Фибоначи.
 *  Серията на Фибоначи се състои от числа, където всяко едно число е сбор от предишните 2 числа. А първите 2 числа са 0 и 1. Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
 *  Броят на числата n, които трябва да се отпечатат се въвеждат от конзолата.
 *  Отпечатайте числата с един интервал между всяко едно число.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int userInput = scanner.nextInt();
        int numOne = 0;
        int numTwo = 1;
        int nextNum;

        for (int i = 0; i <= userInput; i++) {
            System.out.println(numOne);
            nextNum = numOne + numTwo;
            numOne = numTwo;
            numTwo = nextNum;
        }
    }
}
