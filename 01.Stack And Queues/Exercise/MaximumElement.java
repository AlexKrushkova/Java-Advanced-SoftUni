import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commandsCount; i++) {
            String commandTypes = scanner.nextLine();
            if (commandTypes.length() > 2) {
                String[] command = commandTypes.split("\\s+");
                stack.push(Integer.parseInt(command[1]));
            } else if (commandTypes.equals("2")) {
                stack.pop();
            }
             else if (commandTypes.equals("3")) {
                int maxValue = Integer.MIN_VALUE;
                for (int num : stack) {
                    if (num > maxValue) {
                        maxValue = num;
                    }
                }

                 System.out.println(maxValue);
            }
        }
    }
}