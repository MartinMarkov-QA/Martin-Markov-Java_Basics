package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

/*
 *  2. CapitalizeString
 *  Направете програма, която отпечатва буквите от A до Z, като използвате цикъл.
 *  Всяка буква трябва да е на отделен ред.
 */
public class AtoZ {
    public static void main(String[] args) {
        String englishCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < englishCapitalLetters.length(); i++) {
            System.out.println(englishCapitalLetters.charAt(i));
        }
    }
}
