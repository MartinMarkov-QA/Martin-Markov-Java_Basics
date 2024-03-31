package WEEK_3.Task_Многомерни_масиви;

import java.util.Random;
import java.util.Scanner;

/*
 *  2. TheMatrix
 *  Направете програма, която:
 *  Очаква потребителят да въведе редове (<10). Докато потребителят не въведе коректен ред, програмата продължава да го пита за броя на редовете. Използвайте подканващ стринг “Брой редове: “
 *  Очаква потребителят да въведе колони (<10). Докато потребителят не въведе коректна колона, програмата продължава да го пита за броя на колоните. Използвайте подканващ стринг “Брой колони: “
 *  Иска от него да въведе двете матрици, които са съставени от цели числа. Използвайте същите подканващи низове като в дадения пример.
 *  След това тя трябва да отпечата:
 *  Двете матрици една до друга. Отделете двете матрици с низа ” | “
 *  стринга “Сумата на матриците е:” на отделен ред
 *  Сборът им (поелементарна сума)
 *  стрингът “Директната сумата на матриците е:” на отделен ред
 *  Сборът им (пряка/директна сума)
 *  Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравняване наляво.
 *  За помощ използвайте wikipedia или MathIsFun
 *  Наблегнете на валидирането на входните данни при въвеждане размера на матрицата.
 */
public class TheMatrix {
    // Generate and returns random number between 1 and 9 (inclusive)
    public static int radnomNum1to9() {
        // Create an instance of the Random class
        Random random = new Random();
        // Generate a random number between 1 and 9 (inclusive)
        return random.nextInt(9) + 1;
    }

    // Filling in 2d array with random integer values 1-9
    public static void fill2dArray(int[][] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = radnomNum1to9();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2d arrays rows and columns declaration
        int rowsArray;
        int columnsArray;

        // 2d array rows initialisation
        do {
            System.out.println("Брой редове < 10:");
            rowsArray = scanner.nextInt();
        } while (rowsArray <= 0 || rowsArray >= 10);

        // 2d array columns initialisation
        do {
            System.out.println("Брой колони < 10:");
            columnsArray = scanner.nextInt();
        } while (columnsArray <= 0 || columnsArray >= 10);

        // Initialising two 2d arrays
        int[][] array2dA = new int[rowsArray][columnsArray];
        int[][] array2dB = new int[rowsArray][columnsArray];

        // filling in both array with random numbers 1-9
        fill2dArray(array2dA);
        fill2dArray(array2dB);

        // Displaying 2d arrays results
        System.out.println("Двете матрици:");
        for (int a = 0; a < array2dA.length; a++) {
            for (int b = 0; b < array2dA[a].length; b++) {
                System.out.printf("%-4d", array2dA[a][b]);
            }
            System.out.print(" | ");
            for (int b = 0; b < array2dB[a].length; b++) {
                System.out.printf("%-4d", array2dB[a][b]);
            }
            System.out.println();
        }

        System.out.println("Сумата на матриците е:");
        for (int a = 0; a < array2dA.length; a++) {
            for (int b = 0; b < array2dA[a].length; b++) {
                System.out.printf("%-4d", array2dA[a][b] + array2dB[a][b]);
            }
            System.out.println();
        }

        System.out.println("Директната сумата е:");
        for (int[] rowInts : array2dA) {
            for (int intValue : rowInts) {
                System.out.printf("%-4d", intValue);
            }
            for (int ignored : rowInts) {
                System.out.printf("%-4d", 0);
            }
            System.out.println();
        }

        for (int[] rowInts : array2dB) {
            for (int ignored : rowInts) {
                System.out.printf("%-4d", 0);
            }
            for (int intValue : rowInts) {
                System.out.printf("%-4d", intValue);
            }
            System.out.println();
        }
    }
}
