package kr.ac.inha.adapter;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Digimon agumon = new Agumon();

        testPokemon(pikachu);
        //testPokemon(agumon); // incompatible types: kr.ac.inha.adapter.Digimon cannot be converted to kr.ac.inha.adapter.Pokemon
    }
    static void testPokemon(Pokemon pokemon){
        pokemon.attack();
        pokemon.defend();
    }
}
