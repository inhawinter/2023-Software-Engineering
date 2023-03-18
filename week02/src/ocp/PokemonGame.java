package ocp;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("피카츄", 5, 150);
        Charizard charizard = new Charizard("리자몽", 36, 3000);

        pikachu.attack();
        charizard.attack();
        pikachu.evolve();
        charizard.evolve();
    }
}
