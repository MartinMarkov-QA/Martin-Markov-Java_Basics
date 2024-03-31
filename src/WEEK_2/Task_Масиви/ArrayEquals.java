package WEEK_2.Task_Масиви;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  2. ArrayEquals
 *  Нека имаме следният масив:
 *  int[] myArray = { 1, 10, 15 };
 *  Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
 *  Сверете дали елементите на въведения масив е същият, като myArray и ако е, отпечатайте “true”, в противен случай – “false”.
 *
 */
public class ArrayEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArray = { 1, 10, 15 };
        int[] userArray = new int[3];

        System.out.println("Please, enter your first number:");
        userArray[0] = scanner.nextInt();
        System.out.println("Please, enter your second number:");
        userArray[1] = scanner.nextInt();
        System.out.println("Please, enter your third number:");
        userArray[2] = scanner.nextInt();

        // Sorting userArray to make sure returns true when the array values are the same but with different index positions
        System.out.println(Arrays.equals(myArray, Arrays.stream(userArray).sorted().toArray()));
    }
}
