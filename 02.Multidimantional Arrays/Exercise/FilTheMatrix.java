import java.util.Scanner;

public class FilTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];


        if (pattern.equals("A")) {
            matrix = fillPatternA(size);
        } else {
            matrix = fillPatternB(size);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillPatternB(int size) {
        int [][] matrix = new int[size][size];

        int value =1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int rows = 0; rows < size; rows++) {
                    matrix[rows][col] = value++;
                }
            }
            else {
                for (int row = size-1; row >=0 ; row--) {
                    matrix[row][col] = value++;
                }
            }
        }
        return matrix;
    }

    private static int[][] fillPatternA(int size) {
        int [][] matrix = new int[size][size];
        
        int value =1;
        for (int col = 0; col < size; col++) {
            for (int rows = 0; rows < size; rows++) {
                matrix[rows][col] = value++;
            }
        }
        return matrix;
    }
}
