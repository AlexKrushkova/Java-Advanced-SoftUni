import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char operBracket = expression.charAt(i);
            if ('(' == operBracket){
                stack.push(i);
            }
            else if (')' == operBracket){
                System.out.println(expression.substring(stack.pop(), i+1));
            }
        }
    }
}
