package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  3. CapitalizeString
 *  Направете програма, която очаква потребителят да въведе едно цяло изречение.
 *  Нека вашата програма прочете изречението и след това, ако започва с малка буква да я смени на голяма. Нека добави
 *  точка, ако изречението не завършва със символ за край на изречението – точка, удивителна или въпросителна.
 */
public class CapitalizeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a sentence.");
        String userInputSentence = scanner.nextLine();
        String englishCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String firstLetterInUserInputSentence = userInputSentence.substring(0, 1);

        // Capitalise the first letter of the sentence in case it's lowercase
        if (!englishCapitalLetters.contains(firstLetterInUserInputSentence)) {
            userInputSentence = firstLetterInUserInputSentence.toUpperCase() + userInputSentence.substring(1);
        }

        // Adding dot at the end of the sentence if any of those ".!?" are not provided
        String symbolsForTheEndOfTheSentence = ".!?";
        String lastSymbolInUserInputSentence = userInputSentence.substring(userInputSentence.length() - 1);
        if (!symbolsForTheEndOfTheSentence.contains(lastSymbolInUserInputSentence)) {
            userInputSentence = userInputSentence + ".";
        }

        System.out.println(userInputSentence);
    }
}
