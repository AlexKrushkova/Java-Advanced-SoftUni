import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> names = new LinkedHashSet<>();

        int count = Integer.parseInt(scanner.nextLine());
        while (!(count-- ==0)) {
           String name =scanner.nextLine();

           if (!names.contains(name)){
               names.add(name);
           }
        }
        for (String n:names) {
            System.out.println(n);
        }
    }
}
