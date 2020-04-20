import java.util.*;


public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> Emails = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!(name).equalsIgnoreCase("stop")) {
            String email = scanner.nextLine();

                if (!email.contains(name) &&
                        (!email.toLowerCase().endsWith(".uk") &&
                        (!email.toLowerCase().endsWith(".us") &&
                                (!email.toLowerCase().endsWith(".com"))))){
                    Emails.put(name,email);
            }
                name = scanner.nextLine();
        }

        for (Map.Entry<String,String> entry: Emails.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(),entry.getValue()));
        }
    }
}
