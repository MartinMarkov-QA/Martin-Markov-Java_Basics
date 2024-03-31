package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  10. PrimeNumber
 *  Направете програма, която очаква от потребителя да въведе число. След това проверява дали числото е просто и
 *  отпечатва true, ако е, false, ако не е.
 *  Простото число може да се дели само на 1 и на себе си. Ако се дели на което и да е друго цяло число, тогава не е просто.
 *  Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int userInput = scanner.nextInt();
        int modulo = 2;
        boolean isPrime = true;
        // Number must be greater than 1, to be possible Prime number
        if (userInput > 1) {
            for (;modulo <= userInput / 2; modulo++) {
                if (userInput % modulo == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
        }   else {
            System.out.println("Please, enter number, greater than 1");
        }
    }
}
