import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] comands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int numberToPush = comands[0];
        int numbersToPop = comands[1];
        int peekToCheck = comands[2];

        for (int i = 0; i <numberToPush ; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < numbersToPop; i++) {
            queue.poll();
        }
        if (queue.contains(peekToCheck)) {
            System.out.println("true");
        } else if (queue.size() > 0) {
            int minNum = Integer.MAX_VALUE;
            for (int num : queue) {
                if (num < minNum) {
                    minNum = num;
                }
            }
            System.out.println(minNum);
        } else {
            System.out.println("0");
        }
    }
}
