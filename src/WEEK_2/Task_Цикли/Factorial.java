package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  2. Factorial
 *  Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
 *  Потребителят може да въведе невалидно число (нула или отрицателно). Искайте да въведе число, докато не въведе положително.
 *  Ако не си спомняте от математиката:
 *  Факториел на 3 = 3 * 2 * 1
 *  Факториел на 50 = 50 * 49 * 48 … * 2 * 1
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        do {
            System.out.println("Please, enter a positive number:");
            userInput = scanner.nextInt();
        }   while (userInput <= 0);

        int factorial = 1;
        for (;userInput > 0; userInput--) {
            factorial *= userInput;
        }
        System.out.printf("Your Factorial number is: %d", factorial);
    }
}
