package E07Google;

public class Pokemons {
    private String name;
    private String type;

    public Pokemons(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name + " " + this.type;
    }
}
