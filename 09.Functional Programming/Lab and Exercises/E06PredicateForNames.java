import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class E06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String [] text = scanner.nextLine().split("\\s+");

        Predicate<String> checkLength = name ->  name.length() <= length;
        Consumer<String> printer = System.out::println;

        Arrays.stream(text)
                .filter(checkLength)
                .forEach(printer);
    }
}
