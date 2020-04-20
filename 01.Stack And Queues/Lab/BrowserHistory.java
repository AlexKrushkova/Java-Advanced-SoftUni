import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> url = new ArrayDeque<>();
        String input = "";

        while (!"Home".equalsIgnoreCase(input=scanner.nextLine())) {
            if (!input.equals("back")) {
                url.push(input);
                System.out.println(input);
            } else {
                if (url.size() > 1) {
                    url.pop();
                    System.out.println( url.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }
        }
    }
}
