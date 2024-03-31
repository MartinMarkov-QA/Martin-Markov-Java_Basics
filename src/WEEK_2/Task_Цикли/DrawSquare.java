package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  1. DrawSquare
 *  Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
 *  # # # #
 *  # # # #
 *  # # # #
 *  # # # #
 */
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number between 0-30:");
        int userInput = scanner.nextInt();
        int templateCount = userInput;

        while (userInput > 0) {
            System.out.println("# ".repeat(templateCount));
            userInput--;
        }
    }
}
