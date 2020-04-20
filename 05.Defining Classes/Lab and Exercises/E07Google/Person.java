package E07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemons> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Cars car;

    public Person(String name){
        this.name=name;
        this.setCompany(new Company());
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = new Cars("", 0);
    }
    public void addPokemon(Pokemons pokemon){
        this.pokemons.add(pokemon);
    }
    public void addParent(Parent parent){
        this.parents.add(parent);
    }

    public void addChild(Child child){
        this.children.add(child);
    }


    public void setCompany(Company company){
        this.company = company;
    }

    public void setCar(Cars car) {
        this.car = car;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.name);
        sb.append(System.lineSeparator())
                .append(this.company.toString())
                .append(System.lineSeparator())
                .append(this.car.toString())
                .append(System.lineSeparator());
        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemons pokemon: pokemons) {
            sb.append(pokemon.toString()).append(System.lineSeparator());
        }
        sb.append("Parents:").append(System.lineSeparator());
        for (Parent pa: parents) {
            sb.append(pa.toString()).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Child kid: children) {
            sb.append(kid.toString());
        }
        return sb.toString();
    }
}
