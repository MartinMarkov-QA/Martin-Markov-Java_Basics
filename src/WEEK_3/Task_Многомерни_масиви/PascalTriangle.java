package WEEK_3.Task_Многомерни_масиви;

/*
 *  1. PascalTriangle
 *   В лекцията имаше пример за така нареченият тригълник на Паскал. Допълнете програмата, така че да разпечата този триъгълник на екрана.
 *   Нека n = 5, a елементите на тригълника да са отделени от 1 празен символ. Вижте примера долу, който е за 3 елемента.
 */
public class PascalTriangle {
    public static void main(String[] args) {

        // задаваме само броя на редовете
        int[][] triangle = new int[5][];
        for (int i = 0; i < 5; i++) {
            // създаване на елементите на реда
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for (int[] ints : triangle) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }
    }
}
