package WEEK_2.Task_Условия;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 *  3. TaxCalculator
 *  Напишете програма – калкулатор на данъците.
 *  В България имаме плосък данък, което означава, че винаги имаме 10% данък независимо от заплатата ни.
 *  Но в някои държави данъка зависи от това колко ни е голяма заплатата.
 *  Именно такъв калкулатор ще направим!
 *  Като за начало, в нашата програма трябва да въведем годишната заплата.
 *  След това да изчислим данъка както следва:
 *  за първите 20000 няма данък
 *  за вторите 20000 има данък от 10%, но само върху парите надвишаващи необлагаемите доходи.
 *  за третите 20000 данъкът е както следва: ** 0 за първите 20000 ** 10% за вторите 20000 ** 20% за парите над 40000
 *  всички пари над 60000 се таксуват с 30%
 *  Пример: ако имам годишна заплата 83000, ще трябва да платя:
 *  0 за първите 20к
 *  10% от вторите 20к – т.е. 2000
 *  20% от третите 20к – т.е. 4000
 *  30% от останалите 23000 – т.е. 6900
 *  или общо 12900
 *  Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your annual salary:");
        double annualSalary = scanner.nextDouble();

        double taxableAmount;
        double taxPercentage;
        double totalTaxAmount = 0;
        if (annualSalary <= 20_000) {
            System.out.println("You don't own any tax payments.");
        } else {
            if (annualSalary > 20_000 && annualSalary <= 40_000) {
                taxPercentage = 0.10;
                taxableAmount = annualSalary - 20_000;
                totalTaxAmount = taxableAmount * taxPercentage;
            } else if (annualSalary > 40_000 && annualSalary <= 60_000) {
                taxPercentage = 0.20;
                taxableAmount = annualSalary - 40_000;
                totalTaxAmount = taxableAmount * taxPercentage + 2000; // adding additional 2000, left over from the 10% tax amount
            } else {
                taxPercentage = 0.30;
                taxableAmount = annualSalary - 60_000;
                totalTaxAmount = taxableAmount * taxPercentage + 6000; // adding additional 6000, left over from the 10% and 20% tax amounts
            }
        }

        BigDecimal finalTaxToBePaid = new BigDecimal(totalTaxAmount).setScale(2, RoundingMode.HALF_UP); // Turning the final amount to BigInteger, so we can round to the second number after the decimal
        System.out.printf("You have to pay %s in taxes", finalTaxToBePaid);
    }
}
