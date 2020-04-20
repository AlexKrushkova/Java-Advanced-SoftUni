import java.util.FormatFlagsConversionMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            phoneBook.putIfAbsent(name, number);
            if (phoneBook.containsKey(name)) {
                String oldNum = phoneBook.get(name);
                phoneBook.replace(name, oldNum, number);
            }
        }

        while (!((input = scanner.nextLine()).equals("stop"))) {
            if (!phoneBook.containsKey(input)) {
                System.out.println(String.format("Contact %s does not exist.", input));
            } else if (phoneBook.containsKey(input)) {
               String number =  phoneBook.get(input);
                System.out.println(String.format("%s -> %s",
                        input,number));
            }
        }
    }
}
