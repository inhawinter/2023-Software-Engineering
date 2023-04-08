package decorator;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new BasicPokemon("피카츄", 5, 20);

        Pokemon charizard = new BasicPokemon("리자몽", 36, 2000);
        Pokemon strongCharizard = new ElectricDecorator(new FireDecorator(charizard));
        strongCharizard.attack();
        System.out.println(strongCharizard.getName() +"의 체력은 " + strongCharizard.getHP() + "입니다");

        Pokemon firePikachu = new FireDecorator(pikachu);
        Pokemon electricPikachu = new ElectricDecorator(pikachu);
        Pokemon electricFirePikachu = new FireDecorator(electricPikachu);

        pikachu.attack();
        firePikachu.attack();
        electricPikachu.attack();
        electricFirePikachu.attack();
    }
}
