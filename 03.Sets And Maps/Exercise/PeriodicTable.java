import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> periodicTable = new TreeSet<>();

        int count = Integer.parseInt(scanner.nextLine());
        while (!(count-- ==0)) {
            String input =scanner.nextLine();
            if (input.length()>1){
                String[] line = input.split(" ");
                for (String inp: line) {
                    if (!periodicTable.contains(inp)){
                        periodicTable.add(inp);
                    }
                }
            }
            else{
                if(!periodicTable.contains(input)){
                    periodicTable.add(input);
                }
            }
        }
        for (String output:periodicTable) {
            System.out.print(output + " ");
        }
    }
}
