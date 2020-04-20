import java.util.*;


public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = "";
        int value;
        Map<String,Integer> mine = new LinkedHashMap<>();

        String resource = " ";
        int lines = 0;
        while (!(resource).equals("stop")) {
            resource = scanner.nextLine();
            if (!resource.equals("stop")) {
                int quantity = Integer.parseInt(scanner.nextLine());
                if (!mine.containsKey(resource)) {
                    mine.put(resource, quantity);
                } else {
                    int val = mine.get(resource);
                    mine.put(resource, val += quantity);
                }
            }
        }
       for (Map.Entry<String,Integer> entry: mine.entrySet()) {
            System.out.println(String.format("%s -> %d", entry.getKey(),entry.getValue()));
        }
    }
}
