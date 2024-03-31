package WEEK_2.Task_Условия;

import java.util.Scanner;

/*
 *  3. NumberOfWords
 *  Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
 *  Използване на String.split().length за да определите броят на думите.
 *  Ако са повече от 10 – просто отпечатва “твърде дълго изречение” (без кавичките)
 */
public class NumberOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Моля, въведете изречение:");
        String sentence = scanner.nextLine();
        String[] sentenceWords = sentence.split(" ");
        int wordsCount = sentenceWords.length;

        switch (wordsCount) {
            case 1:
                System.out.println("Изречението се състои от една дума");
                break;
            case 2:
                System.out.println("Изречението се състои от две думи");
                break;
            case 3:
                System.out.println("Изречението се състои от три думи");
                break;
            case 4:
                System.out.println("Изречението се състои от четри думи");
                break;
            case 5:
                System.out.println("Изречението се състои от пет думи");
                break;
            case 6:
                System.out.println("Изречението се състои от шест думи");
                break;
            case 7:
                System.out.println("Изречението се състои от седем думи");
                break;
            case 8:
                System.out.println("Изречението се състои от осем думи");
                break;
            case 9:
                System.out.println("Изречението се състои от девет думи");
                break;
            case 10:
                System.out.println("Изречението се състои от десет думи");
                break;
            default:
                System.out.println("Tвърде дълго изречение");
        }
    }
}
