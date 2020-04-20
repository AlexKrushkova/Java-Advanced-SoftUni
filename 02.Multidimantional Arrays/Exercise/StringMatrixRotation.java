import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] command = sc.nextLine().replace('(', ' ').replace(')', ' ')
                .split("\\s+");

        int degrees = Integer.parseInt(command[1]);


        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("END")){

            sb.append(input);
            sb.append("$");

            input = sc.nextLine();
        }

        String[] words = sb.toString().split("\\$");
        int biggestLength = words[0].length();
        for (int i = 0; i < words.length; i++) {
            int currentLength = words[i].length();
            if (currentLength > biggestLength){
                biggestLength = currentLength;
            }
        }

        switch ((degrees % 360) / 90){
            case 0:
                char[][] basicMatrix = new char[words.length][biggestLength];
                for (int i = 0; i < words.length; i++) {
                    basicMatrix[i] = words[i].toCharArray();
                }
                printMatrix(basicMatrix);
                break;
            case 1:
                char[][] ninetyDegreesMatrix = new char[biggestLength][words.length];
                for (int col = 0; col < words.length; col++) {
                    for (int row = 0; row <biggestLength; row++) {
                        try {
                            ninetyDegreesMatrix[row][col] = words[words.length - 1 - col].charAt(row);
                        } catch (StringIndexOutOfBoundsException e) {
                            ninetyDegreesMatrix[row][col] = ' ';
                        }
                    }
                }
                printMatrix(ninetyDegreesMatrix);
                break;
            case 2:
                char[][] hunEightyDegreesMatrix = new char[words.length][biggestLength];
                int count = 0;
                for (int row = words.length-1; row >= 0; row--) {
                    for (int col = 0; col < biggestLength; col++) {
                        try {
                            hunEightyDegreesMatrix[row][col] = words[count].charAt(biggestLength-1-col);
                        } catch (StringIndexOutOfBoundsException e){
                            hunEightyDegreesMatrix[row][col] = ' ';
                        }
                    }
                    count++;
                }
                printMatrix(hunEightyDegreesMatrix);
                break;
            case 3:
                char[][] twoHSeventyDegreesMatrix = new char[biggestLength][words.length];
                for (int col = 0; col < words.length; col++) {
                    for (int row = 0; row < biggestLength; row++) {
                        try {
                            twoHSeventyDegreesMatrix[row][col] = words[col].charAt(biggestLength-1-row);
                        } catch (StringIndexOutOfBoundsException e){
                            twoHSeventyDegreesMatrix[row][col] = ' ';
                        }
                    }
                }
                printMatrix(twoHSeventyDegreesMatrix);
                break;
        }

    }
    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}