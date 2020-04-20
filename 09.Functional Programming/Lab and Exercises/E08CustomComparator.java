import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> comparator = (first, second) -> {

            int compare;

            if (first % 2 == 0 && second % 2 != 0) {
                compare = -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                compare = 1;
            } else {
                compare = first - second;
            }
            return compare;
        };

        nums.sort(comparator);

        System.out.println(nums.toString().replaceAll("[\\[\\],]",""));

    }
}

