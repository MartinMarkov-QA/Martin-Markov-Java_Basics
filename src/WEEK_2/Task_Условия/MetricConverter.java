package WEEK_2.Task_Условия;

import java.util.Scanner;

/*
 *  2. MetricConverter
 *  Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
 *  Ето таблицата за конвертиране на 1 meter (m):
 *  1000 millimeters (mm)
 *  100 centimeters (cm)
 *  0.000621371192 miles (mi)
 *  39.3700787 inches (in)
 *  0.001 kilometers (km)
 *  3.2808399 feet (ft)
 *  1.0936133 yards (yd)
 *  Програмата трябва да очаква от потребителя да въведе следните данни:
 *  дължината, която трябва да се конвертира
 *  нейната метрична единица
 *  към коя метрична единица да се конвертира
 *  Използвайте switch вместо вложени if-else. Ако не е валидна матрична единица отпечатайте грешка и излезте от програмата
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the length of your metric type ex. 12, 7.65 or 0.34");
        double userInputMetricValue = scanner.nextDouble();

        System.out.println("Please, enter the metric type, you wish to convert, choosing from the list below:\nm, mm, cm, mi, in, km, ft, yd");
        String userInputFromMetricType = scanner.next().toLowerCase();
        // Converting any user input metric to a meters to save a lot of conditional statements
        double inputMetricValueToMeters = 0;
        switch (userInputFromMetricType) {
            case "m":
                inputMetricValueToMeters = userInputMetricValue;
                break;
            case "mm":
                inputMetricValueToMeters = userInputMetricValue * 0.001;
                break;
            case "cm":
                inputMetricValueToMeters = userInputMetricValue * 0.01;
                break;
            case "mi":
                inputMetricValueToMeters = userInputMetricValue * 1609.344;
                break;
            case "in":
                inputMetricValueToMeters = userInputMetricValue * 0.0254;
                break;
            case "km":
                inputMetricValueToMeters = userInputMetricValue * 1000;
                break;
            case "ft":
                inputMetricValueToMeters = userInputMetricValue * 0.3048;
                break;
            case "yd":
                inputMetricValueToMeters = userInputMetricValue * 0.9144;
                break;
            default:
                System.out.println("Your input metric is invalid, please, restart the program.");
                return;
        }

        System.out.println("Please, choose which metric type you wish to convert to from the list below:\nm, mm, cm, mi, in, km, ft, yd");
        String convertToMetricType = scanner.next().toLowerCase();
        // Converting the meters result from the above switch statement to the user's desired output result
        double outputMetricValueResult = 0;
        switch (convertToMetricType) {
            case "m":
                outputMetricValueResult = inputMetricValueToMeters;
                break;
            case "mm":
                outputMetricValueResult = inputMetricValueToMeters * 1000;
                break;
            case "cm":
                outputMetricValueResult = inputMetricValueToMeters * 100;
                break;
            case "mi":
                outputMetricValueResult = inputMetricValueToMeters * 0.000621371192;
                break;
            case "in":
                outputMetricValueResult = inputMetricValueToMeters * 39.3700787;
                break;
            case "km":
                outputMetricValueResult = inputMetricValueToMeters * 0.001;
                break;
            case "ft":
                outputMetricValueResult = inputMetricValueToMeters * 3.2808399;
                break;
            case "yd":
                outputMetricValueResult = inputMetricValueToMeters * 1.0936133;
                break;
            default:
                System.out.println("Your output metric is invalid, please, restart the program.");
                return;
        }

        System.out.printf("%f %s is equal to %f %s",userInputMetricValue, userInputFromMetricType, outputMetricValueResult, convertToMetricType);
    }
}
