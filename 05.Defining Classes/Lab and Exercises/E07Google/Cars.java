package E07Google;

public class Cars {
    private String model;
    private int speed;

    public Cars (String model,int speed ){
        this.model = model;
        this.speed = speed;
    }

    public Cars(){
        this.model = "";
        this.speed = -1;
    }

    @Override
    public String toString() {
        return this.model.equalsIgnoreCase("")? "Car:" :
                String.format("Car:%n%s %d",
                        this.model, this.speed);
    }
}
