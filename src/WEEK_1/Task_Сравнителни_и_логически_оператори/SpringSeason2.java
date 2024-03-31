package WEEK_1.Task_Сравнителни_и_логически_оператори;

/*
 *  4. SpringSeason2
 *  Напишете програма, в която дефинирате 2 int променливи – month & day.
 *  Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и
 *  false, в противен случай.
 *  Нека:
 *   month = 4
 *   day = 31
 */
public class SpringSeason2 {
    public static void main(String[] args) {
        int month = 4;
        int day = 31;
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
