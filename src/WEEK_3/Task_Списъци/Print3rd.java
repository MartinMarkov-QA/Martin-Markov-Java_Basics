package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 *  6. Print3rd
 *  Напишете програма, която изисква от потребителя да въвежда имена от конзолата, като въвеждането приключва, когато потребителя въведе точка (.).
 *  Отпечатайте 3-тото въведено име на екрана.
 *  Сортирайте списъка и отпечатайте сортирания списък.
 *  Какво ще направите ако няма 3ти елемент? Може би съобщение за грешка?
 */
public class Print3rd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;

        do {
            System.out.println("Please, enter a name below or enter a dot (.) to stop the program:");
            name = scanner.next();
            if (!name.equals(".")) {
                names.add(name);
            }
        } while (!name.equals("."));

        if (names.size() >= 3) {
            System.out.println("This is the third name in your list: " + names.get(2));
        } else {
            System.out.println("Your names list is less than 3 names long!");
        }

        if (!names.isEmpty()) {
            Collections.sort(names);
            System.out.println("Your sorted names list is: " + names);
        }
    }
}
