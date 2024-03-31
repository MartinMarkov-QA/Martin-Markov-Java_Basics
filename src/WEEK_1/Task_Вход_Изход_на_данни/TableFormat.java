package WEEK_1.Task_Вход_Изход_на_данни;

/*
 *  9. TableFormat
 *  Нека имате ученици със следните оценки: Иванчо – 2, Марийка – 6, Пенчо – 4, Голям Петко – 5. Използвайте printf да
 *  отпечатате оценките им в табличен вид, всеки ученик – на отделен ред.
 *  Нека дължината на колоната с имената е 20 символа, а колоната с оценките да е 2 символа.
 *  Имената са първи и са приравнени наляво. Втората колона с оценките е приравнена надясно.
 */
public class TableFormat {
    public static void main(String[] args) {
        String studentOneName = "Иванчо";
        int studentOneGrade = 2;
        String studentTwoName = "Марийка";
        int studentTwoGrade = 6;
        String studentThreeName = "Пенчо";
        int studentThreeGrade = 4;
        String studentFourName = "Голям Петко";
        int studentFourGrade = 5;
        String border = "-----------------------";
        char newLine = '\n';

        System.out.printf(
                border +
                newLine +
                "%-20s|%2d" +
                newLine +
                "%-20s|%2d" +
                newLine +
                "%-20s|%2d" +
                newLine +
                "%-20s|%2d" +
                newLine +
                border,
                studentOneName, studentOneGrade, studentTwoName, studentTwoGrade, studentThreeName, studentThreeGrade, studentFourName, studentFourGrade
        );
    }
}
