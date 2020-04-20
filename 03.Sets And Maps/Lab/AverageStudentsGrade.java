import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKids = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> namesAndGrades = new TreeMap<>();

        for (int i = 0; i <numberOfKids ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            namesAndGrades.putIfAbsent(name,new ArrayList<>());
            namesAndGrades.get(name).add(grade);
        }
        namesAndGrades.forEach((name,grade) -> {
            String allGrades = grade.stream()
                    .map(g->String.format("%.2f", g))
                    .collect(Collectors.joining(" "));
            double avg = grade.stream().mapToDouble(e -> e).average().orElse(0d);
            System.out.println(String.format("%s -> %s (avg: %.2f)",
                    name,allGrades,avg));
        });
    }
}
