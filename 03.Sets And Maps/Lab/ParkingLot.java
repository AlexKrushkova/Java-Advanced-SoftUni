import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while(!input.equalsIgnoreCase("END")){
            String [] command = input.split(", ");
            String direction = command[0];
            String carNumber = command[1];

            if (direction.equalsIgnoreCase("IN")){
                parkingLot.add(carNumber);
            }
            else{
                parkingLot.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if (!parkingLot.isEmpty()){
            for (String car: parkingLot) {
                System.out.println(car);
            }
        }
        else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
