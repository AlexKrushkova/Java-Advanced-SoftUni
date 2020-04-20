import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Count = " +  numbers.size());
        int sum = 0;
        for (int num: numbers) {
            sum+=num;
        }

        System.out.println("Sum = " + sum);
    }
}
