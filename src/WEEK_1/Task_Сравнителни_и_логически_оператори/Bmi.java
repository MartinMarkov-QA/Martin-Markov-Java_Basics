package WEEK_1.Task_Сравнителни_и_логически_оператори;

/*
 *  1. BMI
 *  Направете програма BMI, с която да изчислите моя Body Mass Index.
 *  Аз тежа 80кг и съм висок 171см. Ако съм съм надвишил малко теглото и съм Overweight
 *  напишете на екрана more training, less eating, ако не съм – напишете you rock!
 */
public class Bmi {
    public static void main(String[] args) {
        double userWeightInKg = 80;
        double userHeightInCm = 171;
        // Turning user height from centimeters to meters for easier use in the BMI formula
        double userHeightInMeters = userHeightInCm / 100;
        double bmi = userWeightInKg / Math.pow(userHeightInMeters, 2);
        // Measurement value took from https://www.calculator.net/bmi-calculator.html
        String result = bmi < 25 ? "You rock!" : "More training, less eating.";

        System.out.println(result);
    }
}
