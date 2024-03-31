package WEEK_2.Task_Масиви;

import java.util.Scanner;

/*
 *  4. FindElementIndex
 *  Нека имаме следният масив:
 *  int[] myArray = { 1, 4, 6, 2, 10, 5 };
 *  Напишете програма, която очаква потребителят да въведе число и след това намира на кой индекс се намира това число в дадения масив.
 *  Ако числото не е в масива, нека програмата отпечата -1.
 */
public class FindElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArray = {1, 4, 6, 2, 10, 5};

        System.out.println("Please, enter a number:");
        int userInput = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == userInput) {
                result = i;
                break;
            }   else {
                result = -1;
            }
        }

        System.out.println(result);
    }
}
