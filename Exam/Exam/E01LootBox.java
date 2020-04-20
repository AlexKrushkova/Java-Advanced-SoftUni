import java.util.*;
import java.util.stream.Collectors;

public class E01LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        List<Integer> secondBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();

        List<Integer> collection = new ArrayList<>();

        for (Integer num: firstBox) {
            first.offer(num);
        }

        for (Integer num: secondBox) {
            second.push(num);
        }

        while(!first.isEmpty() && !second.isEmpty()){
            int one = first.peek();
            int two = second.peek();

            int sum = one + two;

            if (sum %2 ==0){
                one = first.poll();
                two = second.pop();
                collection.add(sum);
            }
            else{
                first.addLast(two);
                two = second.pop();
            }
        }
        if(first.isEmpty()){
            System.out.println("First lootbox is empty");
        }
        else{
            System.out.println("Second lootbox is empty");
        }

        int finalsum = 0;
        for (Integer num:collection) {
            finalsum+=num;
        }
        if (finalsum >= 100){
            System.out.println(String.format("Your loot was epic! Value: %d", finalsum));
        }
        else {
            System.out.println(String.format("Your loot was poor... Value: %d", finalsum));
        }
    }
}
