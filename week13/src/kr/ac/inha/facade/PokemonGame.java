package kr.ac.inha.facade;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Item item = new Item();
        Bag bag = new Bag();

        Trainer trainer = new Trainer(pokemon, item, bag);
        trainer.startBattle();
        trainer.openBag();
    }
}
