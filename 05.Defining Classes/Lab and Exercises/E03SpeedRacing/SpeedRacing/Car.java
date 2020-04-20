package E03.SpeedRacing;
public class Car {
    private String model;
    private double fuel;
    private double consumption;
    private int distanceTravelled;

    public Car (String model, double fuel, double consumption){
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        this.distanceTravelled = 0;
    }
    public boolean drive(int distance){
        double fuelNeeded = distance * this.consumption;

        if (fuelNeeded <= this.fuel){
            this.fuel -= fuelNeeded;
            this.distanceTravelled += distance;
            return true;
        }
        else{
            return false;
        }
    }
    public double getFuel(){
        return this.fuel;
    }
    public int getDistanceTravelled(){
        return this.distanceTravelled;
    }
}
