package basic.array;

import java.util.Scanner;

public class MaxOfMatrixRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        int[][] matrix = getMatrix(n);
        int[][] result = calcMax(matrix);
        printMatrix(result);
    }


    static int[][] getMatrix(int n) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter[%d][%d]:", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    static int[][] calcMax(int[][] matrix) {
        int[][] maxNumbers = new int[matrix.length][1];
        for (int i = 0; i < matrix.length; i++) {
            int maxOfRow = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxOfRow) {
                    maxOfRow = matrix[i][j];
                }
            }
            maxNumbers[i][0] = maxOfRow;
        }
        return maxNumbers;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            System.out.print("[");
            for (int number : array) {
                System.out.print(number + ",");
            }
            System.out.print("]\n");
        }
    }
}
