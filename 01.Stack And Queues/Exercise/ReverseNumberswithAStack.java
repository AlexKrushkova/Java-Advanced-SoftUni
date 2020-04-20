import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberswithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print = "";
        ArrayDeque<Integer> numbersReversed = new ArrayDeque<>();
        int [] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int num: Numbers) {
            numbersReversed.push(num);
        }
        while (numbersReversed.size()>0){
            System.out.print(numbersReversed.pop()+ " ");
        }
    }
}
