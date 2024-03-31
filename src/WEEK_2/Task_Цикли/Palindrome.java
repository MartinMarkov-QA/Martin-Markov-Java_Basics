package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  3. Palindrome
 *  Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
 *  Игнорирайте малки-големи букви.
 *  Ако думата е палиндром, да отпечата true, в противен случай false.
 *  Палиндром е дума, която се чете еднакво отпред и отзад. Например следните думи са палиндроми: mom, radar, nikokin
 *  Тази задача е една от най-често срещаните при технически интервюта.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a word:");
        String userInput = scanner.next().toLowerCase();

        // Storing the reversed version of the userInput in the StringBuilder object, so we can compare them easily latter
        StringBuilder reversedUserInput = new StringBuilder();
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedUserInput.append(userInput.charAt(i));
        }

        // Using contentEquals() method to compare both results to save time to turn and store reversedUserInput into a String object
        System.out.println(userInput.contentEquals(reversedUserInput));
    }
}
