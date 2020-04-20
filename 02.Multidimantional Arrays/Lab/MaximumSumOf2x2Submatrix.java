import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrix = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = matrix[0];
        int matrixCols = matrix[1];

        int[][] arrayMatrix = new int[matrixRows][matrixCols];

        for (int i = 0; i < matrixRows; i++) {
            arrayMatrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxValue = Integer.MIN_VALUE;
        int [] [] maxMetrix = new int [2][2];

        for (int row = 0; row < arrayMatrix.length-1 ; row++) {
            for (int col = 0; col < arrayMatrix[row].length-1; col++) {
                int current = arrayMatrix[row][col];
                int right = arrayMatrix[row][col + 1];
                int below = arrayMatrix[row + 1][col];
                int diagonal = arrayMatrix[row +1][col + 1];

                int sum = current+right+below+diagonal;
                if (sum > maxValue){
                    maxValue = sum;
                    maxMetrix[0][0] = current;
                    maxMetrix[0][1] = right;
                    maxMetrix[1][0] = below;
                    maxMetrix[1][1] = diagonal;
                }
            }
        }
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(maxMetrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
    }
}
