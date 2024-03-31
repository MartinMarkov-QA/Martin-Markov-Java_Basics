package WEEK_3.Task_Списъци;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 *  10. UnionAndIntersection Two ArrayLists
 *  Напишете програма която:
 *   Чете два списъка от конзолата
 *   Извежда в конзолата тяхното обединение и сечение. Ползвайте ArrayList или LinkedList.
 */
public class ArrayListUnionAndIntersection {
    // Method to find the Intersection between two ArrayLists
    public static ArrayList<Integer> intersectionArrayLists(ArrayList<Integer> arrayListOne, ArrayList<Integer> arrayListTwo) {
        // Creating copies of the original ArrayLists, so we don't mutate the originals
        ArrayList<Integer> arrayListA = new ArrayList<>(arrayListOne);
        ArrayList<Integer> arrayListB = new ArrayList<>(arrayListTwo);
        arrayListA.retainAll(arrayListB);
        return arrayListA;
    }

    // Method to find the Union between two ArrayLists
    public static ArrayList<Integer> unionArrayLists(ArrayList<Integer> arrayListOne, ArrayList<Integer> arrayListTwo) {
        Set<Integer> union = new HashSet<>(arrayListOne);
        union.addAll(arrayListTwo);
        return new ArrayList<>(union);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayListOne = new ArrayList<>();
        ArrayList<Integer> arrayListTwo = new ArrayList<>();
        int userInput;

        System.out.println("Please, enter a number below:");
        userInput = scanner.nextInt();
        arrayListOne.add(userInput);
        do {
            System.out.println("Please, keep adding numbers to your first number collection or press 0, to start adding items to your second number collection");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                arrayListOne.add(userInput);
            }
        } while (userInput != 0);

        System.out.println("Please, enter a number below for your second number collection:");
        userInput = scanner.nextInt();
        arrayListTwo.add(userInput);
        do {
            System.out.println("Please, keep adding numbers to your second number collection or press 0, to stop the program and see the results");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                arrayListTwo.add(userInput);
            }
        } while (userInput != 0);

        System.out.println("ArrayList One = " + arrayListOne);
        System.out.println("ArrayList Two = " + arrayListTwo);

        /*
         *   Examples of union:
         *   For a union and an intersection example, use the set B = {1, 2, 3, 4, 5, 6} and the set D = {3, 5, 7, 9, 10}.
         *   The union of sets B and D is the set {1, 2, 3, 4, 5, 6, 7, 9, 10}.
         */
        ArrayList<Integer> unionArrayLists = new ArrayList<>(unionArrayLists(arrayListOne, arrayListTwo));
        System.out.println("Array List Union from arrayListOne and arrayListTwo = " + unionArrayLists);

        /*
         *   Examples of intersection:
         *   For a union and an intersection example, use the set B = {1, 2, 3, 4, 5, 6} and the set D = {3, 5, 7, 9, 10}.
         *   The intersection of sets B and D is the set {3, 5}.
         */
        ArrayList<Integer> arrayListIntersection = new ArrayList<>(intersectionArrayLists(arrayListOne, arrayListTwo));
        System.out.println("Array List Intersection from arrayListOne and arrayListTwo = " + arrayListIntersection);
    }
}
