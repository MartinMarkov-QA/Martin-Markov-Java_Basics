package WEEK_1.Task_Сравнителни_и_логически_оператори;

/*
 *  2. DivideBy17
 *  Измислих си едно число – 8589935681. Чудя се дали се дели на 17.
 *  Напишете програма, която проверява дали числото се дели на 17. И ако е така – напишете на екрана yes, в противен случай напишете no.
 *  Подсказка – използвайте операторите ‘остатък от делене’ и ternary оператор.
 */
public class DivideBy17 {
    public static void main(String[] args) {
        long userInput = 8589935681L;
        int divisor = 17;
        String result = userInput % divisor == 0 ? "Yes" : "No";

        System.out.println(result);
    }
}
