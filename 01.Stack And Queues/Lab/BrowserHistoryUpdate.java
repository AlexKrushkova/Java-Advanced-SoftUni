import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> url = new ArrayDeque<>();
        String input = "";

        while (!"Home".equalsIgnoreCase(input=scanner.nextLine())) {
            if (input.equals("forward")) {
                if (url.size() > 1) {
                    url.poll();
                    System.out.println(url.peek());
                } else {
                    System.out.println("no next URLs");
                }
            }
            else if (input.equalsIgnoreCase("back")){
                    System.out.println(url.poll());
            } else {
                url.offer(input);
                System.out.println(input);

            }
        }
    }
}
