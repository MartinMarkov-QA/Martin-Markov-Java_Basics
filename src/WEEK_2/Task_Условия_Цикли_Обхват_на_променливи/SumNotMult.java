package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  12. SumNotMult
 *  Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.
 *  Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.
 *  Първото въведено число е x, a второто – y.
 */
public class SumNotMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int x = scanner.nextInt();

        System.out.println("Please, enter a number:");
        int y = scanner.nextInt();

        int resultBySumming = 0;
        for (int i = 0; i < x; i++) {
            resultBySumming += y;
        }

        System.out.println(resultBySumming);
    }
}
