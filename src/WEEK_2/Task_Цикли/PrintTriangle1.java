package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  4. PrintTriangle1
 *  Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
 *  1 2 3 4 5
 *  1 2 3 4
 *  1 2 3
 *  1 2
 *  1
 */
public class PrintTriangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number between 0-30:");
        int userInput = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        for (int a = 0; a <= userInput; a++) {
            for (int b = 1; b <= userInput; b++) {
                output.append(b).append(" ");
            }
            System.out.println(output);
            a = 0;
            userInput--;
            output = new StringBuilder();
        }
    }
}
