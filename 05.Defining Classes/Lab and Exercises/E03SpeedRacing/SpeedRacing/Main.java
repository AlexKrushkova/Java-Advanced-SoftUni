package E03.SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int count = Integer.parseInt(reader.readLine());

        Map<String, Car> garage = new LinkedHashMap<>();

        while (count-- > 0) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuel ,consumption);
            garage.putIfAbsent(model,car);
        }

        String line  = reader.readLine();
        while(!"End".equalsIgnoreCase(line)){
            String [] tokens = line.split("\\s+");
            String command = tokens[0];
            String model = tokens[1];
            int distance =Integer.parseInt(tokens[2]);

            if (!garage.get(model).drive(distance)){
                System.out.println("Insufficient fuel for the drive");
            }
            line = reader.readLine();
        }
        garage.entrySet().forEach((entry -> {
            System.out.println(String.format("%s %.2f %d",
                    entry.getKey(),
                    entry.getValue().getFuel(),
                    entry.getValue().getDistanceTravelled()
                    ));
        }));
    }
}
