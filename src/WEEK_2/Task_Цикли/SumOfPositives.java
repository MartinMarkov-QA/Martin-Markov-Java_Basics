package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  7. SumOfPositives
 *  Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
 *  Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг “Въведете положително число: “.
 *  Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
 *  Отпечатайте :
 *  Сумата с точност до вторият знак след десетичната запетая.
 *  Кое е най-голямото въведено число
 *  Кое е най-малкото въведено число
 *  Помислете кой цикъл е най-добре да използвате? while, do-while или for?
 */
public class SumOfPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userInput;
        double numbersSum = 0;
        double minNumber = Integer.MAX_VALUE;
        double maxNumber = Integer.MIN_VALUE;
        boolean atLeastOneValueEntered = false;
        do {
            System.out.print("Please, enter a positive number and press enter: ");
            userInput = scanner.nextDouble();

            if (userInput > 0) {
                atLeastOneValueEntered = true;
                numbersSum += userInput;

                if (userInput > maxNumber) {
                    maxNumber = userInput;
                }

                if (userInput < minNumber) {
                    minNumber = userInput;
                }
            }
        }   while (userInput > 0);

        if (atLeastOneValueEntered) {
            System.out.printf("Your total sum of numbers is: %,.2f\n", numbersSum);
            System.out.printf("The biggest number, you entered is: %,f\n", maxNumber);
            System.out.printf("The smallest number, you entered is: %,f", minNumber);
        }   else {
            System.out.println("Looks like you haven't entered any positive number.");
            System.out.println("Please, restart the program and enter at least one positive number.");
        }
    }
}
