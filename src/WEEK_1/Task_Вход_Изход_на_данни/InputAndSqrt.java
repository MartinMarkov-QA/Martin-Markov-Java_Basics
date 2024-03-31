package WEEK_1.Task_Вход_Изход_на_данни;

import java.util.Scanner;

/*
 *  7. InputAndSqrt
 *  Напишете програма, която чете 1 число от конзолата, изчислява му корен квадратен и отпечатва резултата на
 *  екрана с точност до 5-тия знак след запетаята.
 */
public class InputAndSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number below:");
        double userInput = scanner.nextDouble();
        double result = Math.sqrt(userInput);

        System.out.printf("The square root of your number is: %.5f", result);
    }
}
