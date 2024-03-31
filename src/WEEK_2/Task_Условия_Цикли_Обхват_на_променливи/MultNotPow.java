package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  9. MultiplicationTable
 *  Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.
 *  Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.
 *  Първото въведено число е x, a второто – y.
 */
public class MultNotPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number");
        int num = scanner.nextInt();

        System.out.println("Please, enter a number");
        int pow = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * num;
        }

        System.out.printf("%d ^ %d = %d", num, pow, result);
    }
}
