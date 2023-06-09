package kr.ac.inha.facade;

public class PokemonGame {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.startBattle();
        trainer.openBag();
    }
}
