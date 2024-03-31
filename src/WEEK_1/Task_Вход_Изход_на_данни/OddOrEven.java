package WEEK_1.Task_Вход_Изход_на_данни;

import java.util.Scanner;

/*
 *  8. OddOrEven
 *  Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
 *  Ако числото е четно, трябва да се изпише “even” (без кавичките), а ако е нечетно – трябва да се изпише “odd”.
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To find out if your number is Even or Odd, please, enter it below:");
        String result = scanner.nextInt() % 2 == 0 ? "even" : "odd";

        System.out.println(result);
    }
}
