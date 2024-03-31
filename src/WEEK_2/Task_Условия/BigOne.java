package WEEK_2.Task_Условия;

import java.util.Scanner;

/*
 *  1. BigOne
 *  Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
 *  Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
 *  Например: “резултатът е 10” e невалидно.
 */
public class BigOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To find which number is bigger than other, please enter, your first number below:");
        double numberOne = scanner.nextDouble();

        System.out.println("Please, enter your second number below:");
        double numberTwo = scanner.nextDouble();

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        }   else {
            System.out.println(numberTwo);
        }
    }
}
