import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrix = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = matrix[0];
        int matrixCols = matrix[1];

        int[][] arrayMatrix = new int[matrixRows][matrixCols];
        int sum = 0;
        for (int row = 0; row < arrayMatrix.length ; row++) {
            String[] inputData = scanner.nextLine().split(", ");
            arrayMatrix[row] = new int[inputData.length];

            for (int col = 0; col < inputData.length; col++) {
                int number = Integer.parseInt(inputData[col]);
                arrayMatrix[row][col] = number;

                sum+=arrayMatrix[row][col];
            }
        }
        System.out.println(matrixRows);
        System.out.println(matrixCols);
        System.out.println(sum);
    }
}
