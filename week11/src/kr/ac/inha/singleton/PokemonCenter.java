package kr.ac.inha.singleton;

import java.util.ArrayList;

class PokemonCenter {
    private static PokemonCenter center = null;
    private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

    private PokemonCenter() {
        pokemonList.add(new Pokemon("Pikachu"));
        pokemonList.add(new Pokemon("Squirtle"));
//        pokemonList.add(new Pokemon("Charmander"));
    }

    public synchronized static PokemonCenter getCenter() {  // after synchronized
        if (center == null) {
            center = new PokemonCenter();
        }
        return center;
    }

    public synchronized Pokemon getPokemon() {
        while(true){
            for (Pokemon pokemon : pokemonList) {
                if (pokemon.isAvailable()) {
                    pokemon.setAvailable(false);
                    return pokemon;
                }
            }
        }
    }
}