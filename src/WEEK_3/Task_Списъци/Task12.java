package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  12. Task12
 *  Напишете програма която:
 *  1. Чете елементите на един списък от конзолата
 *  2. Извежда в конзолата двойките индекси (i, j) на елементите които удовлетворяват следното условие: Ai*Aj<=max(Ai, Ai+1, … Aj), i<j
 *  Например ако имаме списък с елементи 1 1 2 4 2 тогава очакваният изход е (0, 1), (0, 2), (0, 3), (0, 4), (1, 2), (1, 3), (1, 4), (2, 4)
 *  (2, 3), (3, 4) не трябва да го има
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        ArrayList<Integer> listNumbers = new ArrayList<>();

        do {
            System.out.println("Please, enter a number, to add to your list of numbers, or enter zero (0), to stop the program.");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                listNumbers.add(userInput);
            }
        } while (userInput != 0);

        // Извежда в конзолата двойките индекси (a, b) на елементите които удовлетворяват следното условие: a*b <= max(Ai, Ai+1, Ai2 …)
        int listNumbersMaxValue = Collections.max(listNumbers);
        for (int a = 0; a < listNumbers.size(); a++) {
            for (int b = a + 1; b < listNumbers.size(); b++) {
                if (listNumbers.get(a) * listNumbers.get(b) <= listNumbersMaxValue) {
                    System.out.printf("(%d, %d), ", a, b);
                }
            }
        }
    }
}
