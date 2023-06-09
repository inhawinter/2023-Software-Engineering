package kr.ac.inha.facade;

public class Trainer {
    private Pokemon pokemon;
    private Item item;
    private Bag bag;

    public Trainer() {
        this.pokemon = new Pokemon();
        this.item = new Item();
        this.bag = new Bag();
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
