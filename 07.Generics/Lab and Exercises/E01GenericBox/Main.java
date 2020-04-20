package E01GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-->0){
            String line = scanner.nextLine();
            GenerixBox box = new GenerixBox(Integer.parseInt(line));
            System.out.println(box.toString());
        }
    }
}
