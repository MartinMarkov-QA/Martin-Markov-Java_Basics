package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  6. ReverseNumber
 *  Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
 *  Ако числото е отрицателно – просто игнорирайте знака.
 *  Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
 *  Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
 *  Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
 *  Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number below:");
        // In case the user input is a negative number we are using the absolute value
        int userInput = Math.abs(scanner.nextInt());

        String userInputToString = Integer.toString(userInput);
        String userInputReversed = new StringBuilder()
                .append(userInputToString)
                .reverse()
                .toString();
        System.out.println(Integer.parseInt(userInputReversed));
    }
}
