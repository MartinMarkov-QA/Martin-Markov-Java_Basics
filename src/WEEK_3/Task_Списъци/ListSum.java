package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  5. ListSum
 *  Напишете програма, която събира въведените от потребителя цели числа. Въвеждането продължава докато потребителя въведе 0.
 */
public class ListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please, enter a number to start the program or 0 to stop the program.");
        int userNumber = scanner.nextInt();
        ArrayList<Integer> userNumbers = new ArrayList<>();

        if (userNumber != 0) {
            userNumbers.add(userNumber);
        }

        while (userNumber != 0) {
            System.out.println("Add one more number to your numbers or enter 0, to stop the program and see the result.");
            userNumber = scanner.nextInt();

            if (userNumber != 0) {
                userNumbers.add(userNumber);
            }
        }

        int userNumbersSum = 0;
        for (int num : userNumbers) {
            userNumbersSum += num;
        }

        System.out.printf("The sum of your numbers is: %d", userNumbersSum);
    }
}
