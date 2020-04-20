import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> valuesAndCounts = new LinkedHashMap<>();

        for (double value:values) {
            if(!valuesAndCounts.containsKey(value)){
                valuesAndCounts.put(value,1);
            }
            else {
                valuesAndCounts.put(value,valuesAndCounts.get(value)+1);
            }
        }
        for (Double key:valuesAndCounts.keySet()) {
            System.out.println(String.format("%.1f -> %d", key,valuesAndCounts.get(key)));
        }
    }
}
