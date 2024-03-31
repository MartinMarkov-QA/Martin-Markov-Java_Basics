package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  11. SortAndMergeTwoArrayLists
 *  Напишете програма която:
 *   Чете два списъка от конзолата
 *   Сортира ги
 *   Обединява ги в един нов трети списък.
 */
public class SortAndMergeTwoArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayListOne = new ArrayList<>();
        ArrayList<Integer> arrayListTwo = new ArrayList<>();
        int userInput;
        System.out.println("Please enter a number below:");
        userInput = scanner.nextInt();
        arrayListOne.add(userInput);
        do {
            System.out.println("Please, keep adding numbers to your first number collection or press 0, to start adding items to your second number collection");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                arrayListOne.add(userInput);
            }
        } while (userInput != 0);

        System.out.println("Please enter a number below for your second number collection:");
        userInput = scanner.nextInt();
        arrayListTwo.add(userInput);
        do {
            System.out.println("Please, keep adding numbers to your second number collection or press 0, to stop the program and see the results");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                arrayListTwo.add(userInput);
            }
        } while (userInput != 0);

        System.out.println("ArrayList One = " + arrayListOne);
        System.out.println("ArrayList Two = " + arrayListTwo);

        Collections.sort(arrayListOne);
        Collections.sort(arrayListTwo);

        System.out.println("ArrayList One sorted ascending = " + arrayListOne);
        System.out.println("ArrayList Two sorted ascending = " + arrayListTwo);

        arrayListOne.addAll(arrayListTwo);

        ArrayList<Integer> arrayListThree = new ArrayList<>(arrayListOne);

        System.out.println("ArrayList Three result merged from ArrayList One and ArrayList Two = " + arrayListThree);
    }
}
