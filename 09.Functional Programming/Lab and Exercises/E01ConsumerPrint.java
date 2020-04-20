import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = string -> System.out.println("Sir " + string);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(printer);
    }
}
