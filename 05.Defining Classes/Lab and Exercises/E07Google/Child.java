package E07Google;

public class Child {
    String name;
    String birthDay;

    public Child (String name, String birthDay){
        this.name= name;
        this.birthDay = birthDay;
    }
    @Override
    public String toString() {
        return this.name + " " + this.birthDay;
    }
}
