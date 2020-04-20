import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class E05ReverseandExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int devisibleNumbers = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> filteredNumbers = num -> num % devisibleNumbers !=0;

        UnaryOperator<List<Integer>> removeDevisableNumbers = list -> list.stream()
                .filter(filteredNumbers)
                .collect(Collectors.toList());

        numbers = removeDevisableNumbers.apply(numbers);
        Collections.reverse(numbers);

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
