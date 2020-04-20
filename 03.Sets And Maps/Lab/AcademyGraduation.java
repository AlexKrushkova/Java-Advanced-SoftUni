import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> graduationList = new TreeMap<>();
        int count = Integer.parseInt(scanner.nextLine());

        while (!(count-- ==0)) {
            String studentName = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            graduationList.putIfAbsent(studentName,new ArrayList<>());
            graduationList.get(studentName).addAll(grades);
        }

        graduationList.forEach((studentName, grades)->{
            double sum = 0;
            for (Double grade:grades) {
                sum+=grade;
            }
            sum = sum/grades.size();
            System.out.println(String.format("%s is graduated with %s",
                    studentName, sum));
        });
    }
}
