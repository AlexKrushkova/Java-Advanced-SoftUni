import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] MatrixDim = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = MatrixDim[0];
        int matrixCols = MatrixDim[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int row = 0; row < matrix.length ; row++) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int col = 0; col < line.length; col++) {
                int value = Integer.parseInt(line[col]);
                matrix[row][col] = value;
            }
        }
        int number = Integer.parseInt(scanner.nextLine());
        boolean hasNoMatch = true;
        for (int row = 0; row < matrix.length; row++) {
            int [] ints = matrix[row];
            for (int col = 0; col <ints.length ; col++) {
                int value = ints[col];
                if (value==number){
                    hasNoMatch=false;
                    System.out.println(row + " " + col);
                }
            }
        }
        if (hasNoMatch){
            System.out.println("not found");
        }
    }
}
