package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  13. ToBinary
 *  Нека потребителят въведе цяло положително число.
 *  Тогава, използвайки цикъл, преобразувайте числото в двоичен вид и го разпечатайте на екрана, започвайки отзад напред.
 *  Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101.
 */
public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        StringBuilder toBinaryNumber = new StringBuilder();
        for (int i = 1; i <= userInput;) {
            if (userInput % 2 == 0) {
                toBinaryNumber.append(0);
            }   else {
                toBinaryNumber.append(1);
            }
            userInput /= 2;
        }

        System.out.println(toBinaryNumber);
    }
}
