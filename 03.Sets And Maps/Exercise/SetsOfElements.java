import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] lenghts = scanner.nextLine().split(" ");
        int lenghtOne = Integer.parseInt(lenghts[0]);
        int lenghtTwo = Integer.parseInt(lenghts[1]);

        Set<String> firstLenght = new LinkedHashSet<>();
        Set<String> secondLenght = new LinkedHashSet<>();
        Set<String> lastOne = new LinkedHashSet<>();

        for (int i = 0; i <lenghtOne ; i++) {
            String input = scanner.nextLine();
            firstLenght.add(input);
        }
        for (int i = 0; i <lenghtTwo ; i++) {
            String input = scanner.nextLine();
            secondLenght.add(input);
        }
        for (String lenn:firstLenght) {
            if (secondLenght.contains(lenn)){
                lastOne.add(lenn);
            }
        }
        for (String combined:lastOne) {
            System.out.print(combined + " ");
        }
    }
}
