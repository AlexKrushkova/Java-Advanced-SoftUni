package L01.CarInfo;

import java.lang.reflect.Constructor;

public class L01CarInfo {
    private String make;
    private String model;
    private int horsePower;

    public L01CarInfo (String make){
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public L01CarInfo(String make, String model, int horsePower){
        this(make);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void increaseHP(int value){
        this.horsePower += value;
    }
    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.",
                this.getMake(),
                this.getModel(),
                this.getHorsePower());
    }
}
