package dip;

class Trainer {
    private final Pokemon pokemon;

    public Trainer() {
        pokemon = new Pokemon();
    }

    public void catchPokemon() {
        System.out.println("포켓몬 획득~");
    }

    public void battle() {
        pokemon.attack();
    }
}

class Pokemon {
    public void attack() {
        System.out.println("공격!");
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Trainer jiwoo = new Trainer();
        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}
