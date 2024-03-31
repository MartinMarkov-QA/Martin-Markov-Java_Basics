package WEEK_3.Task_Списъци;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  2. Flag
 *  Напишете програма, която отпечатва фигурата по-долу на екрана:
 *  ██████████
 *
 *  ██████████
 *
 *  ██████████
 *
 *  Създайте масив, който да запълните със символа ‘u2588’, използвайки метода Array.fill().
 *
 *  Ако ви е интересно, можете да добавите цвят преди всеки ред като отпечатате стринга “�33[ЦВЯТm”, като за цвят имате следните числа:
 *  39 = бял
 *  32 = червен
 *  31 = зелен
 *  ! ВНИМАНИЕ ! – не пускайте решение с цвят, защото системата ще го приеме за грешно. Направете цвета, само ако сте любопитни и само на вашия компютър.
 */
public class Flag {
    public static void main(String[] args) {
        char stripeSymbol = '\u2588';
        char[] stripeSymbolArray = new char[15];
        Arrays.fill(stripeSymbolArray, stripeSymbol);

        for (int i = 0; i < 3; i++) {
            System.out.println(stripeSymbolArray);
            System.out.println();
        }
    }
}
