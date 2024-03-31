package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  5. PrintTriangle2
 *  Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
 *  # # # # # #
 *   # # # # #
 *    # # # #
 *     # # #
 *      # #
 *       #
 */
public class PrintTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number between 0-30:");
        int userInput = scanner.nextInt();
        int templateCount = userInput;
        String outputFrontSpace = "";

        while (userInput > 0) {
            System.out.println(outputFrontSpace.concat("# ".repeat(templateCount)));
            outputFrontSpace = outputFrontSpace.concat(" ");
            userInput--;
            templateCount--;
        }
    }
}
