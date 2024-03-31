package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  8. MultiplicationTable
 *  Вашата програма очаква от потребителя да въведе число. След това отпечатва таблица за умножението на това число
 *  със всички числа от 1 до 10.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = userInput * i;
            System.out.printf("%d x %d = %d \n", userInput, i, result);
        }
    }
}
