package WEEK_2.Task_Условия;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 *  5. Осигуровки
 *  Направете програма, която изчислява осигуровките.
 *  За целта потребителя трябва да въведе следните данни:
 *  месечна заплата
 *  години
 *  Има 2 такси, които се плащат едната от служителя, а другата – от неговият работодател.
 *  Законът изисква:
 *  Ако заплатата е под 3000лв
 *  Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
 *  Ако служителя е над 55 години до 60 (включително) – 13% + 13%
 *  Ако служителя е над 60 години до 65 (включително) – 7.5% + 9%
 *  Ако служителя е над 65 – 5% + 7.5%
 *  Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.
 *  Отпечатайте:
 *  първо колко е таксата за служителя
 *  колко е таксата за работодателя
 *  Не забравяйте, че можете да използвате вложени if-else структури.
 *  Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
 */
public class SocialSecurity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your monthly salary:");
        double salary = scanner.nextDouble();

        System.out.println("Please, enter your age:");
        int employeeAge = scanner.nextInt();

        double employeeTaxPercentage;
        double employeeTaxAmount;
        double employerTaxPercentage;
        double employerTaxAmount;
        if (salary < 3000) {
            if (employeeAge <= 55) {
                employeeTaxPercentage = 0.20;
                employerTaxPercentage = 0.17;
            } else if (employeeAge <= 60) {
                employeeTaxPercentage = 0.13;
                employerTaxPercentage = 0.13;
            } else if (employeeAge <= 65) {
                employeeTaxPercentage = 0.075;
                employerTaxPercentage = 0.09;
            } else {
                employeeTaxPercentage = 0.05;
                employerTaxPercentage = 0.075;
            }
            employeeTaxAmount = salary * employeeTaxPercentage;
            employerTaxAmount = salary * employerTaxPercentage;
        } else {
            employeeTaxPercentage = 0.20;
            employerTaxPercentage = 0.20;
            employeeTaxAmount = 3000 * employeeTaxPercentage;
            employerTaxAmount = 3000 * employerTaxPercentage;
        }
        BigDecimal employeeTaxResult = new BigDecimal(employeeTaxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal employerTaxResult = new BigDecimal(employerTaxAmount).setScale(2, RoundingMode.HALF_UP);

        System.out.printf("The employee tax is: %s \nThe employer tax is: %s", employeeTaxResult, employerTaxResult);
    }
}
