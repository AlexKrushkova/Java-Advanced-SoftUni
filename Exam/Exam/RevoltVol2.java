import java.util.Scanner;

public class RevoltVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine());
        int moves = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][];

        int PlayerRow = -1;
        int PlayerCol = -1;


        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();
            if (line.contains("f")) {
                PlayerRow = i;
                PlayerCol = line.indexOf("f");

            }
        }
        boolean isFinished = false;

        while (moves-- > 0 && !isFinished) {
            String directions = scanner.nextLine();

            if(directions.equals("up")){
                field[PlayerRow][PlayerCol] = '-';
                if (PlayerRow - 1 < 0) {
                    PlayerRow = field.length - 1;
                } else {
                    PlayerRow = PlayerRow - 1;
                }
                if (field[PlayerRow][PlayerCol] == 'F') {
                    field[PlayerRow][PlayerCol] = 'f';
                    isFinished = true;
                    break;
                }
                else if (field[PlayerRow][PlayerCol] == 'T') {
                    if (PlayerRow + 1 == field.length) {
                        PlayerRow = 0;
                    } else {
                        PlayerRow++;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                } else if (field[PlayerRow][PlayerCol] == 'B') {
                    if (PlayerRow - 1 < 0) {
                        PlayerRow = field.length - 1;
                    } else {
                        PlayerRow = PlayerRow - 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }
            }

            if (directions.equals("down")) {
                field[PlayerRow][PlayerCol] = '-';
                if (PlayerRow + 1 == field.length) {
                    PlayerRow = 0;
                } else {
                    PlayerRow++;
                }
                if (field[PlayerRow][PlayerCol] == 'F') {
                    field[PlayerRow][PlayerCol] = 'f';
                    isFinished = true;
                    break;
                } else if (field[PlayerRow][PlayerCol] == 'T') {
                    if (PlayerRow - 1 < 0) {
                        PlayerRow = field.length - 1;
                    } else {
                        PlayerRow = PlayerRow - 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                } else if (field[PlayerRow][PlayerCol] == 'B') {
                    if (PlayerRow + 1 == field.length) {
                        PlayerRow = 0;
                    } else {
                        PlayerRow = PlayerRow + 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }

            }


            if (directions.equals("left")) {
                field[PlayerRow][PlayerCol] = '-';
                if (PlayerCol - 1 < 0) {
                    PlayerCol = field.length - 1;
                } else {
                    PlayerCol = PlayerCol - 1;
                }

                if (field[PlayerRow][PlayerCol] == 'F') {
                    field[PlayerRow][PlayerCol] = 'f';
                    isFinished = true;
                    break;
                }
                if (field[PlayerRow][PlayerCol] == 'T') {
                    if (PlayerCol + 1 == field.length) {
                        PlayerCol = 0;
                    } else {
                        PlayerCol = PlayerCol + 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }
                if (field[PlayerRow][PlayerCol] == 'B') {
                    if (PlayerCol - 1 < 0) {
                        PlayerCol = field.length - 1;
                    } else {
                        PlayerCol = PlayerCol - 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }
            }

            if (directions.equals("right")) {
                field[PlayerRow][PlayerCol] = '-';
                if (PlayerCol + 1 == field.length) {
                    PlayerCol = 0;
                } else {
                    PlayerCol = PlayerCol + 1;
                }

                if (field[PlayerRow][PlayerCol] == 'F') {
                    field[PlayerRow][PlayerCol] = 'f';
                    isFinished = true;
                    break;
                }
                if (field[PlayerRow][PlayerCol] == 'T') {
                    if (PlayerCol - 1 < 0) {
                        PlayerCol = field.length - 1;
                    } else {
                        PlayerCol = PlayerCol - 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }
                if (field[PlayerRow][PlayerCol] == 'B') {
                    if (PlayerCol + 1 == field.length) {
                        PlayerCol = 0;
                    } else {
                        PlayerCol = PlayerCol + 1;
                    }
                    field[PlayerRow][PlayerCol] = 'f';
                }
            }
            field[PlayerRow][PlayerCol] = 'f';
        }
            if (isFinished) {
                System.out.println("Player won!");
            } else {
                System.out.println("Player lost!");
            }

            printMatrix(field);

        }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
