package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

import java.util.Scanner;

/*
 *  4. CharFrequency
 *  Направете програма, която очаква от потребителяt да въведе:
 *  Изречение
 *  Символ
 *  Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
 *  Метода str.charAt(i) връща символа от даденият стринг на позиция i.
 */
public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a sentence:");
        String userSentence = scanner.nextLine();

        System.out.println("Please, enter a symbol:");
        char userSymbol = scanner.next().charAt(0);

        int symbolCounter = 0;
        for (int i = 0; i < userSentence.length(); i++) {
            if (userSentence.charAt(i) == userSymbol) {
                symbolCounter++;
            }
        }

        System.out.printf("The symbol: \"%c\" has been met %d times in your sentence.", userSymbol, symbolCounter);
    }
}
