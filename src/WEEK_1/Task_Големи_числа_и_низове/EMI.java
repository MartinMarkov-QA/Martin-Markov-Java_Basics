package WEEK_1.Task_Големи_числа_и_низове;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 *  5. EMI
 *  Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на
 *  определена дата всеки календарен месец. Приравнени месечни вноски се използват за изплащане на лихви и
 *  главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
 *  Годишната вноска се изчислява по формулата:
 *  Където:
 *   P е заетата сума
 *   r е годишната лихва
 *   n е броят на вноските
 *  За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.
 *  Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5% и смятам да го изплатя за 10 години.
 *  Колко ще е моята месечна вноска?
 *  ИЗПОЛЗВАЙТЕ BigDecimal!
 *  Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));
 *  Когато използвате метода divide на BigDecimal, го извикайте по следния начин:
 *  import java.math.BigDecimal;
 *  import java.math.RoundingMode;
 *  .....
 *  myDecimal.divide(anotherBigDecimal, RoundingMode.HALF_UP)
 */
public class EMI {
    public static void main(String[] args) {
        /*
         *  The formula to calculate the monthly payment (PMT) for a fixed-rate loan is:
         *  PMT = (P*r*(1+r)^n) / (1+r)^n-1
         *
         *  Where:
         *  PMT - is the monthly payment
         *  P - is the principal amount (loan amount)
         *  r - is the monthly interest rate (annual interest rate divided by 12 and expressed as a decimal)
         *  n - is the number of payments (loan term in months)
         *
         *  This formula assumes that the interest is compounded monthly.
         */
        int P = 10_000_000;
        double r = 10.5 / (100 * 12);
        int n = 10 * 12;

        // I have decided to split the calculation in two parts for better readability
        // I am using the BigDecimal.valueOf() as per the recommendation at the docs in the BigDecimal class
        BigDecimal formulaTopPart = BigDecimal.valueOf(P * r * (Math.pow(1 + r, n))); // (P*r*(1+r)^n)
        BigDecimal formulaBottomPart = BigDecimal.valueOf(Math.pow(1 + r, n) - 1); // (1+r)^n-1

        BigDecimal PMT = formulaTopPart.divide(formulaBottomPart, RoundingMode.HALF_UP); // (P*r*(1+r)^n) / (1+r)^n-1

        System.out.println(PMT.setScale(10, RoundingMode.HALF_UP)); // The result for monthly payment rounded to the 10th digit after the decimal point: 134934.9967755467
    }
}
