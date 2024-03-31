package WEEK_2.Task_Цикли;

import java.util.Scanner;

/*
 *  8. Vowels
 *  Направете програма Vowels, която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.
 *  Дължината на String можете да вземете чрез метода String.length(), например: “hello world”.length(). А за да вземете
 *  първият символ от стринга, ползвайте “hello world”.charAt(0)
 */
public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a sentence in English");
        String userInput = scanner.nextLine().toLowerCase();

        String englishVowels = "aeiou";
        int vowelsCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (englishVowels.contains(Character.toString(userInput.charAt(i)))){
                vowelsCounter++;
            }
        }
        System.out.printf("Your sentence contains %d Vowels.", vowelsCounter);
    }
}
