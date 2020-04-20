import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String,List <String>> continentCountry = new LinkedHashMap<>();
        Map<String,List <String>> countryTowns = new LinkedHashMap<>();


        for (int rotations = 0; rotations < count; rotations++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];


        }
    }
}

