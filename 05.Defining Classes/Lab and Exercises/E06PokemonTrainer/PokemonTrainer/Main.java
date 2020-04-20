package E06.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon = null;
        LinkedHashMap<String, List<Pokemon>> trainerInfo = new LinkedHashMap<>();
        Trainer trainer = null;
        LinkedHashMap<String, Trainer> trainersPrinted = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("Tournament")) {
            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);
            pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainerInfo.putIfAbsent(trainerName, new ArrayList<>());
            trainerInfo.get(trainerName).add(pokemon);
            trainer = new Trainer(trainerName, 0, 0);
            trainersPrinted.putIfAbsent(trainerName, trainer);


            input = scanner.nextLine().split("\\s+");

        }
        String line = scanner.nextLine();
        while (!line.equalsIgnoreCase("END")) {
            String element = line;

            for (Map.Entry<String, List<Pokemon>> a : trainerInfo.entrySet()) {
                boolean elementFound = false;
                for (Pokemon z : a.getValue()) {
                    if (z.getElement().equals(element)) {
                        trainersPrinted.get(a.getKey()).setNumBadges();
                        elementFound = true;
                        break;
                    }
                }
                if (!elementFound) {
                    ArrayDeque<Integer> deadPokemonIndexes = new ArrayDeque<>();

                    for (int i = 0; i < a.getValue().size(); i++) {
                        Pokemon currentPokemon = a.getValue().get(i);
                        currentPokemon.takeDamage(10);
                        if (currentPokemon.getHealth() <= 0) {
                            deadPokemonIndexes.push(i);
                        }
                    }
                    while (!deadPokemonIndexes.isEmpty()) {
                        int index = deadPokemonIndexes.pop();
                        a.getValue().remove(index);

                    }
                }
            }
            line = scanner.nextLine();
        }
        trainersPrinted.entrySet().stream().forEach(a -> {
            trainerInfo.entrySet().stream().forEach(b -> {
                if (a.getKey().contains(b.getKey())) {


                    a.getValue().setPokemonCollections(b.getValue().size());
                }
            });
        });
        trainersPrinted.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().getNumBadges(), a.getValue().getNumBadges())).forEach(a -> {
            System.out.println(String.format("%s %d %d", a.getValue().getName(), a.getValue().getNumBadges(), a.getValue().getPokemonCollections()));
        });
    }
}
