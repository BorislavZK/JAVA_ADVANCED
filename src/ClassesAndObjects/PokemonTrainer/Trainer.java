package ClassesAndObjects.PokemonTrainer;

import java.util.List;

public class Trainer {

    //The trainer has a name, a number of badges, and a collection of pokemon
    private String name;
    private int badges;
    private List<Pokemon> pokemonCollection;

    public Trainer(String name, List<Pokemon> pokemonCollection) {
        this.name = name;
        this.badges = 0;
        this.pokemonCollection = pokemonCollection;
    }


}
