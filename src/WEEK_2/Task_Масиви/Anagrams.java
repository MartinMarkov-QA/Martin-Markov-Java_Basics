package WEEK_2.Task_Масиви;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  1. Anagrams
 *  Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и false, ако не са.
 *  Абстрахирайте се от големината на буквите.
 *  Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви, които са в разбъркан ред
 *  Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи. За да може
 *  да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.
 *  Не забравяйте един от най-добрите приятели на програмиста – не кучето, а класът Arrays. Той може да ви е от
 *  изключителна полза.
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a string:");
        char[] arrOne = scanner.next().toLowerCase().toCharArray();
        Arrays.sort(arrOne);

        System.out.println("Please, enter one more string:");
        char[] arrTwo = scanner.next().toLowerCase().toCharArray();
        Arrays.sort(arrTwo);

        boolean areAnagrams = true;
        if (arrOne.length == arrTwo.length) {
            for (int i = 0; i < arrOne.length; i++) {
                if (arrOne[i] != arrTwo[i]) {
                    areAnagrams = false;
                    break;
                }
            }
        }   else {
            areAnagrams = false;
        }
        System.out.println(areAnagrams);
    }
}
