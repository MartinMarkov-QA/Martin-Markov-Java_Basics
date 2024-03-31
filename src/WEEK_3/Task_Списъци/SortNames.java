package WEEK_3.Task_Списъци;

import java.util.*;

/*
 *  7. SortNames
 *  Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
 *  След това, имената се сортират в азбучен ред и се отпечатват на екрана.
 */
public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<>();
        System.out.println("Please enter 3 names below:");
        System.out.println("Name one:");
        userNames.add(scanner.next());
        System.out.println("Name two:");
        userNames.add(scanner.next());
        System.out.println("Name three:");
        userNames.add(scanner.next());

        // This time I decided to use sort method of the ArrayList class
        userNames.sort(Comparator.naturalOrder());
        userNames.forEach(System.out::println);
    }
}
