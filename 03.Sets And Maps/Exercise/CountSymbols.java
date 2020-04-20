import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character,Integer> countSymbol = new TreeMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i <input.length() ; i++) {
            char letter = input.charAt(i);
            if (!countSymbol.containsKey(letter)){
                countSymbol.put(letter,1);
            }else{
                countSymbol.put(letter,countSymbol.get(letter)+1);
            }
        }
        countSymbol.forEach((letter,count) ->{
            System.out.println(String.format("%c: %d time/s",
                    letter,count));
        });
    }
}
