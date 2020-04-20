package E06.PokemonTrainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trainer {
    private String name;
    private int numBadges;
    private int pokemonCollections;

    public Trainer(String name,int numBadges,int pokemonCollections){
        this.name=name;
        this.numBadges=numBadges;
        this.pokemonCollections=pokemonCollections;
    }
    public String getName(){
        return this.name=name;
    }

    public int getNumBadges() {
        return numBadges;
    }
    public void setNumBadges(){
        this.numBadges++;
    }
    public void setPokemonCollections(int pokemonCollections){
        this.pokemonCollections=pokemonCollections;
    }

    public int getPokemonCollections() {
        return pokemonCollections;
    }
}
