package WEEK_2.Task_Масиви;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  5. Score
 *  Напишете програма, която подканва потребителя да въведе брой на състезателите и след това да въведе техния резултат в секунди и се записват в масив.
 *  Отпечатва:
 *  Всички резултати
 *  Най-бързия
 *  Най-бавния
 *  Средно аритметично (avg)
 *  Стандартно отклонение (standard deviation). За помощ:
 *  сд1 = сумата от всички ( (елемент – avg) на квадрат)
 *  сд = корен квадратен ( сд1 / броя на елементите)
 *  Изкараният резултат трябва да е подобен на този в дадения пример!
 */
public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number of players:");
        int playersNumber = scanner.nextInt();
        int[] playersScores = new int[playersNumber];
        int playersLoopCounter = 0;
        // Building the players score array
        while (playersLoopCounter < playersScores.length) {
            System.out.printf("Please enter the result in seconds for player number %d: \n", playersLoopCounter + 1); // Adding 1 to the current player number, so they can start from 1 and not from 0
            playersScores[playersLoopCounter] = scanner.nextInt();
            playersLoopCounter++;
        }

        StringBuilder allPlayersResults = new StringBuilder();
        int theFastestScore = Integer.MAX_VALUE;
        int theSlowestScore = Integer.MIN_VALUE;
        double averageScore;
        double totalScore = 0;
        // variables needed to calculate the "Standard Deviation"
        double sumUpSquaredDifferences = 0;
        double variance;
        double standardDeviation;

        for (int i = 0; i < playersScores.length; i++) {
            // Building players scores string
            allPlayersResults
                    .append("Player ")
                    .append(i + 1)
                    .append(" result is: ")
                    .append(playersScores[i])
                    .append("; ");

            // The fastest score
            if (playersScores[i] < theFastestScore) {
                theFastestScore = playersScores[i];
            }

            // The slowest score
            if (playersScores[i] > theSlowestScore) {
                theSlowestScore = playersScores[i];
            }

            // Accumulating all scores to calculate the average score outside the loop below
            totalScore += playersScores[i];
        }
        averageScore = totalScore / playersScores.length;

        // calculations for "Standard Deviation" below
        for (int playersScore : playersScores) {
            sumUpSquaredDifferences += Math.pow(playersScore - averageScore, 2);
        }
        variance = sumUpSquaredDifferences / (playersScores.length - 1);
        standardDeviation = Math.sqrt(variance);

        // Results below
        System.out.println(allPlayersResults);
        System.out.println("The fastest score = " + theFastestScore);
        System.out.println("The slowest score = " + theSlowestScore);
        System.out.printf("The average score = %.2f\n", averageScore);
        System.out.printf("Standard Deviation = %.2f",  standardDeviation);
    }
}
