package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  14. Boby
 *  Боби е тийнейджър и има “изобилен” речник:
 *  Ако го попиташ нещо, отговаря с “Добре.”
 *  Ако му се развикаш (Нетикет: ТОВА Е ВИКАНЕ – т.е. ако сме написали всичко с главни букви, значи му викаме), той
 *  отговаря със “Споко бе, ман!”
 *  Ако му извикаш въпрос, следва “Спокоооо, знам к’во правя!”
 *  Ако просто го посочиш или го гледаш лошо, без да му говориш, той отговаря с “Хубаво деее”
 *  На всичко останало, което му говориш, той кима мъдро и продумва тихо “Ахъ.”.
 *  Направете програма, в която потребителят може да “говори” с Боби, въвеждайки изречение от конзолата в безкраен
 *  цикъл. В зависимост от въведеното изречение, програмата трябва да отпечата отговора на Боби.
 *  Ако въведете точка програмата спира изпълнението си.
 *  Ето примерен разговор:
 *  Здрасти!
 *  Ахъ.
 *  Какво е това Ахъ?
 *  Добре.
 *  ЧУ ЛИ МЕ?
 *  Спокоооо, знам к’во правя!
 *  ТИ НЕ СИ ДОБРЕ!
 *  Споко бе, ман!
 *  Хубаво деее
 */
public class Boby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, type a sentence, to start conversation with Boby or type . to stop the program");
        String userSentence;

        do {
            userSentence = scanner.nextLine();
            boolean lookingBadOrNotTalking = userSentence.isEmpty();
            boolean allLettersCapital = userSentence.toUpperCase().equals(userSentence) && !userSentence.isEmpty();
            boolean lastLetterQuestionMark = userSentence.endsWith("?");
            boolean isSingleDot = userSentence.equals(".");

            if (!isSingleDot) {
                if (lookingBadOrNotTalking) {
                    System.out.println("Хубаво деее");
                } else if (lastLetterQuestionMark && !allLettersCapital) {
                    System.out.println("Добре.");
                } else if (allLettersCapital && lastLetterQuestionMark) {
                    System.out.println("Спокоооо, знам к’во правя!");
                } else if (allLettersCapital) {
                    System.out.println("Споко бе, ман!");
                } else {
                    System.out.println("Ахъ.");
                }
            }
        } while (!userSentence.equals("."));
    }
}
