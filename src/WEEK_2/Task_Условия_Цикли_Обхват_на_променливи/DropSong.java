package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  6. DropSong
 *  Направете програма, която очаква потребителят да въведе някакво число.
 *  След това ако числото се дели:
 *  на 3 – отпечатва “Пльок”
 *  на 5 – “Пляс”
 *  на 7 – “Пльос”
 *  Ако не се дели на нито едно от горните, се печата въведеното число. Въвеждането е в цикъл и продължава докато потребителят въведе числото 0.
 *  При 0 трябва да отпечатате “Пльок Пляс Пльос” – защото 0 се дели без остатък на всички числа.
 *  Примери: 28 се дели на 1, 2, 4, 7, 14, 28 – значи печатаме “Пльос” 30 се дели на 1, 2, 3, 5, 6, 10, 15, 30 – печатаме “Пльок Пляс” 34 се дели 1, 2, 17 и 34, така че просто отпечатваме “34”
 */
public class DropSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.println("\nPlease. enter a number");
            userNumber = scanner.nextInt();

            if (userNumber != 0) {
                if (userNumber % 3 == 0) {
                    System.out.print("Пльок ");
                }
                if (userNumber % 5 == 0) {
                    System.out.print("Пляс ");
                }
                if (userNumber % 7 == 0) {
                    System.out.print("Пльос ");
                }
                if (userNumber % 3 != 0 && userNumber % 5 != 0 && userNumber % 7 != 0) {
                    System.out.print(userNumber);
                }
            }
        } while (userNumber != 0);

        System.out.println("Пльок Пляс Пльос");
    }
}
