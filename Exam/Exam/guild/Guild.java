package guild;
import javax.tools.ForwardingFileObject;
import java.sql.Array;
import java.util.*;

public class Guild {

    private String name;
    private int capacity;
    Map<String, Player> roster;


    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (getCapacity() > this.roster.size()) {
            this.roster.put(player.getName(), player);
        }
    }

    public boolean removePlayer(String name) {
        if (this.roster.containsKey(name)) {
            this.roster.remove(name);
            return true;
        }
        return false;
    }

    public void promotePlayer(String name) {
        if(this.roster.get(getName()).getName().equals(name)) {
            if (!this.roster.get(getName()).getClazz().equals("Member")) {
                this.roster.get(getName()).setRank("Member");
            }
        }
    }

    public void demotePlayer(String name) {
        if (!this.roster.get(getName()).getRank().equals("Trial")){
            this.roster.get(getName()).setRank("Trial");
        }
    }


    public int count(){
        return this.roster.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder(String.format("Players in the guild: %s",getName()));
        sb.append(System.lineSeparator());
        this.roster.values().forEach(e->sb.append(e.toString()).append(System.lineSeparator()));
        return sb.toString().trim();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Player[] kickPlayersByClass(String rogue) {
        Player[] kickedPlayers;
        List<String> strings = null;
        kickedPlayers = new Player[this.roster.size()];
        if (this.roster.get(getName()).getClazz().equals(rogue)){
            strings = Collections.singletonList(this.roster.get(getName()).getClazz());
            this.roster.get(getName()).getClazz().replaceAll(rogue,"");

            }
        assert strings != null;
        kickedPlayers = strings.toArray(new Player[0]);

        return kickedPlayers;
    }

}
