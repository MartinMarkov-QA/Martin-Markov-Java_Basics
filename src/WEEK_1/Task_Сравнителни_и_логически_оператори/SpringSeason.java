package WEEK_1.Task_Сравнителни_и_логически_оператори;

/*
 *  3. SpringSeason
 *  Напишете програма, в която дефинирате 2 int променливи – month & day. Програмата трябва да отпечатва true, ако
 *  денят е между 20-ти март (включително) и 20-ти юни (включително) и false, в противен случай.
 *  Нека:
 *   month = 5
 *   day = 1
 */
public class SpringSeason {
    public static void main(String[] args) {
        int month = 5;
        int day = 1;
        boolean result = ((day >= 20 && day <= 31) && (month == 3)) // Check for March
                ||
                (((day >= 1) && (day <= 30)) && ((month == 4))) // Check for April
                ||
                (((day >= 1) && (day <= 31)) && ((month == 5))) // Check for May
                ||
                ((day >= 1 && day <= 20) && (month == 6));  // Check for June

        System.out.println(result);
    }
}
