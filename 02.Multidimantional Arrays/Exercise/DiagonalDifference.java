import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[size][size];

        for (int r = 0; r <size ; r++) {
            for (int c = 0; c <size ; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        int mainDiagonal = getMainDiagonalSum(matrix);
        int secondDiagonal = getSecondaryDiagonalSum(matrix);
        System.out.println(Math.abs(mainDiagonal-secondDiagonal));
    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int r = matrix.length-1;
        int c = 0;

        while(r>=0 && c < matrix[r].length ){
            sum+=matrix[r--][c++];
        }
        return sum;
    }

    private static int getMainDiagonalSum(int[][] matrix){
        int sum = 0;
        int r=0, c=0;

        while (r<matrix.length && c< matrix[r].length){
           sum+= matrix[r++][c++];
        }
        return sum;
    }
}
