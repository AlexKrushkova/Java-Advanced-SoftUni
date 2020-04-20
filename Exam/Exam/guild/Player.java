package guild;

public class Player {
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return this.clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz){
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    @Override
    public String toString() {
        return String.format("Player %s: %s%n" +
                "Rank: %s%n" +
                "Description: %s",
                getName(),getClazz(),getRank(),getDescription());
    }
}
