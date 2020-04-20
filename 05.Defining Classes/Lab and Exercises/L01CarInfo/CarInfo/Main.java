package L01.CarInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        List<L01CarInfo> cars = new ArrayList<>();

        while (count-- > 0){
            String line = reader.readLine();
            String [] tokens = line.split(" ");
            String make = tokens[0];
            if (tokens.length>1){
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);

                L01CarInfo car = new L01CarInfo(make, model, horsePower);
                car.setMake(make);
                car.setModel(model);
                car.setHorsePower(horsePower);
                cars.add(car);
            }
            else{
                L01CarInfo car = new L01CarInfo(make);
                cars.add(car);
            }
           }
        cars.forEach(c -> System.out.println(c.carInfo()));
    }
}