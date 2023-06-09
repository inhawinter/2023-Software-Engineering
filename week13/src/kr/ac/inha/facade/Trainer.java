package kr.ac.inha.facade;

public class Trainer {
    private Pokemon pokemon;
    private Item item;
    private Bag bag;

    public Trainer(Pokemon pokemon, Item item, Bag bag) {
        this.pokemon = pokemon;
        this.item = item;
        this.bag = bag;
    }

    public void startBattle() {
        System.out.println("Let the battle begin!");
        pokemon.attack();
        item.use();
    }

    public void openBag() {
        System.out.println("I'm opening the bag~");
        bag.open();
    }
}
