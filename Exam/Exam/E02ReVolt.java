import java.util.Scanner;

public class E02ReVolt {
    private static char[][] field;
    private static int playerRow;
    private static int playerCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int countOfComands = Integer.parseInt(scanner.nextLine());

        field = new char[sizeMatrix][];
        playerRow = -1;
        playerCol = -1;


        for (int i = 0; i < sizeMatrix; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();
            if (line.contains("f")) {
                playerRow = i;
                playerCol = line.indexOf("f");
            }
        }

        boolean reachedF = false;

        while (countOfComands-- > 0 && reachedF) {
            String command = scanner.nextLine();
            reachedF = checkMovement(command, playerRow, playerCol, field);

        }
            if(reachedF == true){
                System.out.println("Player won!");
            }
            else{
                System.out.println("Player lost!");
            }
            printMatrix(field);
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static boolean checkMovement(String command, int newRow, int newCol, char[][] field) {
        boolean isFinal = false;
        field[newRow][newCol] = '-';
        switch (command) {
            case "down":
                if (newRow + 1 == field.length) {
                    newRow = 0;
                } else {
                    newRow = newRow + 1;
                }
                checkBonus(command, newRow, newCol, field);
                break;
            case "right":
                if (newCol + 1 == field.length) {
                    newCol = 0;
                } else {
                    newCol = newCol + 1;
                }
                checkBonus(command, newRow, newCol, field);
                break;
            case "left":
                if (newCol - 1 < 0) {
                    newCol = field.length - 1;
                } else {
                    newCol = newCol - 1;
                }
                checkBonus(command, newRow, newCol, field);
                break;

        }

        if (field[newRow][newCol] == 'F') {
            field[newRow][newCol] ='f';
            isFinal = true;
        }
        return isFinal;
    }

    private static void checkBonus(String command, int newRow, int newCol, char[][] field) {
        if (field[newRow][newCol] == 'T') {
            field[newRow][newCol]='f';
            switch (command) {
                case "down":
                    if (newRow -1 < 0) {
                        newRow = field.length-1;
                    } else {
                        newRow = newRow - 1;
                    }
                    break;
                case "left":
                    if (newCol + 1 == field.length) {
                        newCol = 0;
                    } else {
                        newCol = newCol + 1;
                    }
                    break;
                case "right":
                    if (newCol - 1 < 0) {
                        newCol = field.length - 1;
                    } else {
                        newCol = newCol - 1;
                    }
                    break;
            }
        }
        if (field[newRow][newCol] == 'B') {
            field[newRow][newCol]='f';
            switch (command) {
                case "down":
                    if (newRow + 1 == field.length) {
                        newRow = 0;
                    } else {
                        newRow = newRow + 1;
                    }
                    break;
                case "right":
                    if (newCol + 1 == field.length) {
                        newCol = 0;
                    } else {
                        newCol = newCol + 1;
                    }
                    break;
                case "left":
                    if (newCol - 1 < 0) {
                        newCol = field.length - 1;
                    } else {
                        newCol = newCol - 1;
                    }
                    break;
            }
        }
    }
}

