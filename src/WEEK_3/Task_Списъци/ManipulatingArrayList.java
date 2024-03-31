package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  9. ManipulatingArrayList
 *  Напишете програма която:
 *  1. Чете от конзолата числа които са елементи на List
 *  2. Извежда следната информация за списъка: дължина, всички елементи
 *  3. Сортира списъка и извежда резултата
 *  4. Обръща елементите на списъка (1 2 3 -> 3 2 1)
 *  5. Чете елементите на втори списък.
 *  6. Сравнява двата списъка елемент по елемент и на всяка итерация извежда следното съобщение “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”
 *
 */
public class ManipulatingArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        ArrayList<Integer> listNumbersA = new ArrayList<>();

        do {
            System.out.println("Please, enter a number, to add to your first list of numbers, or enter zero (0), to stop.");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                listNumbersA.add(userInput);
            }
        }   while (userInput != 0);

        // Array List One info
        System.out.println("The length of your first List of numbers is: " + listNumbersA.size());
        System.out.print("The elements of your first List of numbers are: ");
        listNumbersA.forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.print("The elements of your first List in sorted format are: ");
        Collections.sort(listNumbersA);
        listNumbersA.forEach(element -> System.out.print(element + " "));
        System.out.println();
        Collections.reverse(listNumbersA);
        System.out.print("The elements of your first List in reversed format are: ");
        listNumbersA.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // Second Array List of numbers logic starts here
        ArrayList<Integer> listNumbersB = new ArrayList<>();
        do {
            System.out.println("Please, enter a number, to add to your second list of numbers, or enter zero (0), to stop.");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                listNumbersB.add(userInput);
            }
        }   while (userInput != 0);

        // display of comparison of each element of both ArrayLists
        for (Integer numberListA : listNumbersA) {
            for (Integer numberListB : listNumbersB) {
                if (numberListA > numberListB) {
                    System.out.printf("Елемент %d от списък 1 е по-голям от елемент %d от списък 2\n", numberListA, numberListB);
                } else if (numberListA < numberListB) {
                    System.out.printf("Елемент %d от списък 1 е по-малък от елемент %d от списък 2\n", numberListA, numberListB);
                } else {
                    System.out.printf("Елемент %d от списък 1 е равен с елемент %d от списък 2\n", numberListA, numberListB);
                }
            }
        }
    }
}
