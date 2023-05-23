package ClassesAndObjects.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        //{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}

        Map<String, List<Pokemon>> pokemonByTrainers = new LinkedHashMap<>();

        while (!line.equals("Tournament")){

            String[] input = line.split("\\s+");

            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            pokemonByTrainers.putIfAbsent(input[0], new ArrayList<>());
            pokemonByTrainers.get(input[0]).add(pokemon);

            line = scan.nextLine();
        }

        List<Trainer> trainerList = pokemonByTrainers.entrySet()
                .stream()
                .map(t -> new Trainer(t.getKey(), t.getValue()))
                .collect(Collectors.toList());


        String command = scan.nextLine();

        while (!command.equals("End")){

            for (Trainer trainer : trainerList) {
                trainer.commandExecuting(command);
            }

            command = scan.nextLine();
        }
        trainerList.stream()
                .sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                .forEach(System.out::println);
    }


}
