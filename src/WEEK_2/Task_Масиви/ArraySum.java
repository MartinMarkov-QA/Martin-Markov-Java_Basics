package WEEK_2.Task_Масиви;

import java.util.Arrays;

/*
 *  3. ArraySum
 *  Напишете програма, която сумира елементите на масив от цели числа и отпечатва резултата на екрана.
 *  Инициализирайте масива със следните числа:
 *  -1
 *  10
 *  4.5
 *  15
 *  3.278
 */
public class ArraySum {
    public static void main(String[] args) {

        double[] myArray = {-1, 10, 4.5, 15, 3.278 };

        double totalFirstVersion = 0;
        for (double element : myArray) {
            totalFirstVersion += element;
        }
        System.out.println("totalFirstVersion = " + totalFirstVersion);

        double totalSecondVersion = Arrays.stream(myArray).reduce(0, Double::sum);
        System.out.println("totalSecondVersion = " + totalSecondVersion);
    }
}
