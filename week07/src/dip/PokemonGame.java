package dip;

interface Battleable {
    void attack();
}

class Trainer {
    private final Battleable battleable;

    public Trainer(Battleable battleable) {
        this.battleable = battleable;
    }

    public void catchPokemon() {
        System.out.println("포켓몬 획득~");
    }

    public void battle() {
        battleable.attack();
    }
}

class Pokemon implements Battleable {
    public void attack() {
        System.out.println("공격!");
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Trainer jiwoo = new Trainer(pikachu);
        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}
