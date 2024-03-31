package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  11. RemoveWhitespaces
 *  Направете програма, която очаква от потребителя да въведе изречение.
 *  След въвеждане на изречението, вашата програма трябва да премахне всички празни символи и табулация от
 *  изречението и да го отпечата на екрана.
 */
public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a sentence:");
        String userSentence = scanner.nextLine();

        // Method 1
        for (int i = 0; i < userSentence.length(); i++) {
            if (userSentence.charAt(i) == ' ') {
                userSentence = userSentence.substring(0, i) + userSentence.substring(i + 1);
                i--; // adding i--; in case there are tabs otherwise the code removes just one empty space
            }
        }
        System.out.println(userSentence);

        // Method 2
        userSentence = userSentence.replace(" ", "");
        System.out.println(userSentence);
    }
}
