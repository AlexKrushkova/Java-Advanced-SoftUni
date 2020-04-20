import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = "";

        while (!"print".equalsIgnoreCase(input=scanner.nextLine())) {
            if (!input.equalsIgnoreCase("cancel")) {
                queue.offer(input);
            }
            else {
                if (!queue.isEmpty()) {
                    String element = queue.poll();
                    System.out.println("Canceled " + element);
                }
                else {
                    System.out.println("Printer is on standby");
                }
            }
            }
        if (!queue.isEmpty()){
           while (!queue.isEmpty()){
               System.out.println(queue.poll());
           }
        }
        }
    }

