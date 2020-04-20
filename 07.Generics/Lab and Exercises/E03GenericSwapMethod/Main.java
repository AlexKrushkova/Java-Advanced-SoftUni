package E03GenericSwapMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<GenericSwapMethod<Integer>> boxes = new ArrayList<>();

        while (n-->0){
            String line = scanner.nextLine();
            GenericSwapMethod<Integer> box = new GenericSwapMethod<>(Integer.parseInt(line));
            boxes.add(box);
        }
        int first  = scanner.nextInt();
        int second = scanner.nextInt();

        swap(boxes, first,second);

        for (GenericSwapMethod<Integer> box : boxes) {
            System.out.println(box.toString());
        }
    }
    private static <T> void swap(List<T> boxes, int first, int second) {
        T element = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, element);
    }
}
