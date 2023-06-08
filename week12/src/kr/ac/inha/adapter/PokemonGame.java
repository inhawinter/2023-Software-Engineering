package kr.ac.inha.adapter;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Digimon agumon = new Agumon();

        // wrap the digimon in a DigimonAdapter, which makes it look like a Pokemon
        Pokemon digimonAdapter = new DigimonAdapter(agumon);

        testPokemon(pikachu);
        testPokemon(digimonAdapter);
    }
    static void testPokemon(Pokemon pokemon){
        pokemon.attack();
        pokemon.defend();
    }
}
