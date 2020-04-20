import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> VIP = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();
        int count = 0;

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("PARTY")) {
            if (input.startsWith("1")
                    || (input.startsWith("2")
                    || (input.startsWith("3")
                    || (input.startsWith("4")
                    || (input.startsWith("5")
                    || (input.startsWith("6")
                    || (input.startsWith("7")
                    || (input.startsWith("8")
                    || (input.startsWith("9")
                    || (input.startsWith("0"))))))))))) {
                VIP.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("END")){
            if (VIP.contains(input)) {
                VIP.remove(input);
            }
            else if (regular.contains(input)){
                regular.remove(input);
            }
                input =scanner.nextLine();
    }
        int totalNum = VIP.size()+regular.size();
        System.out.println(totalNum);
        for (String s:VIP) {
            System.out.println(s);
        }
        for (String r:regular) {
            System.out.println(r);
        }
    }
}