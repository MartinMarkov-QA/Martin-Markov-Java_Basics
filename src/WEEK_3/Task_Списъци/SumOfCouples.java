package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  8. SumOfCouples
 *  Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата и въвеждането продължава, докато въведе 0. (Игнорирайте нулата и не я слагайте в масива/списъка)
 *  След това потребителят трябва да въведе още едно число sum.
 *  Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.
 *  Например, ако потребителят въведе числата [2, 3, 4, 5, 1] и след това въведе сумата 6, тогава трябва да отпечата:
 */
public class SumOfCouples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        int userInputNum;

        // Filling the "numberList" with the user inputs below:
        do {
            System.out.println("Please, enter a number below or enter a zero (0), to stop entering the numbers process:");
            userInputNum = scanner.nextInt();
            if (userInputNum != 0) {
                numbersList.add(userInputNum);
            }
        } while (userInputNum != 0);


        System.out.println("Please, enter your SUM number below:");
        int userSum = scanner.nextInt();
        ArrayList<Integer> sumNumbers = new ArrayList<>();

        // Filtering the pair numbers, that equals the SUM number and putting them in the "sumNumbers" below:
        for (int a = 0; a < numbersList.size(); a++) {
            for (int b = a + 1; b < numbersList.size(); b++) {
                if (numbersList.get(a) + numbersList.get(b) == userSum) {
                    sumNumbers.add(numbersList.get(a));
                    sumNumbers.add(numbersList.get(b));
                }
            }
        }

        // Displaying the result, if any
        if (!sumNumbers.isEmpty()) {
            System.out.println("The numbers that match your SUM are:");
            for (int i = 0; i < sumNumbers.size(); i += 2) {
                System.out.printf("%d %d\n", sumNumbers.get(i), sumNumbers.get(i + 1));
            }
        } else {
            System.out.println("You have no numbers, that match your SUM.");
        }
    }
}
