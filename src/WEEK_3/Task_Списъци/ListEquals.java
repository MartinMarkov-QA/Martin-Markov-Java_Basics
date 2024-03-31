package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 *  3. ListEquals
 *  Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
 *  Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
 *  Сверете дали елементите на въведения списък са същите като в първия и ако са, отпечатайте “true”, в противен случай – “false”.
 *  Кой метод трябва да използвате тук?
 */
public class ListEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 10, 15));
        ArrayList<Integer> userNumbers = new ArrayList<>();

        System.out.println("Please, enter your first number:");
        userNumbers.add(scanner.nextInt());
        System.out.println("Please, enter your second number:");
        userNumbers.add(scanner.nextInt());
        System.out.println("Please, enter your third number:");
        userNumbers.add(scanner.nextInt());

        // Compare if both Array Lists are the same only if their elements are in the same index order
        System.out.println(numbers.equals(userNumbers));

        // We can compare both Array Lists, even when their values are not in the same index order, by sorting them first using the Collections class
        // Sort first the original Array List, in case we decide to change the elements index order, when we initialise it
        Collections.sort(numbers);
        Collections.sort(userNumbers);
        System.out.println(numbers.equals(userNumbers));

        // One drawback of using Collections sort method on the Array Lists entity in order to compare them for equality is that this mutates the original Array List, and we may not want to do that
        // In this case we can create deep copy of both Array Lists, so when we sort both Array List copies and check for equality, this won't mutate the original Array Lists, ex. below:
        ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);
        ArrayList<Integer> userNumbersCopy = new ArrayList<>(userNumbers);
        Collections.sort(numbersCopy);
        Collections.sort(userNumbersCopy);
        System.out.println(numbersCopy.equals(userNumbersCopy));
    }
}
