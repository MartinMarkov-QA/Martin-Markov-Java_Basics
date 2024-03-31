package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *  4. ListRemoveOdd
 *  Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
 *  Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка. Внимавайте с for-a – ако махнете първият елемент – вторият ще стане първи.
 *  Може да почнете итерацията в обратен ред – отзад, напред
 */
public class ListRemoveOdd {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));

        for (int i = numbers.size() - 1; i > 0; i--) {
            if (i % 2 != 0) {
                numbers.remove(i);
            }
        }

        System.out.println("numbers = " + numbers);
    }
}
