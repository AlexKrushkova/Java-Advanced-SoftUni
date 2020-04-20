package E04.RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> garage = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- >0){
            String line = scanner.nextLine();
            String [] tokens = line.split("\\s+");

            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType,
            tire1Pressure, tire1Age,tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);

            garage.putIfAbsent(model, car);
        }
        String line = scanner.nextLine();

        garage.entrySet().forEach((entry -> {
            if (line.equalsIgnoreCase("fragile")){
                if (entry.getValue().getTire1Pressure()<1 ||
                        entry.getValue().getTire2Pressure()<1 ||
                        entry.getValue().getTire3Pressure()<1||
                        entry.getValue().getTire4Pressure()<1){
                    System.out.println(entry.getKey());
                }
            }
            else if (line.equalsIgnoreCase("flamable")){
                if (entry.getValue().getEnginePower()>250){
                    System.out.println(entry.getKey());
                }
            }

        }));

    }

}
