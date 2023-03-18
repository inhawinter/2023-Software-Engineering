package lsp;

interface Pokemon {
    //public abstract void attack();
    void attack();
}
class FirePokemon implements Pokemon{
    @Override
    public void attack() {
        System.out.println("불 속성 공격 성공~");
    }
}
class WaterPokemon implements Pokemon{
    @Override
    public void attack() {
        System.out.println("물 속성 공격 성공!!");
    }
}
class ElectricPokemon implements Pokemon{
    @Override
    public void attack() {
        System.out.println("전기 속성 공격 성공##");
    }
}
class Trainer{
    public void atttackPokemon(Pokemon pokemon){
        pokemon.attack();
    }
}

public class PokemonDemo{
    public static void main(String[]args){
        Trainer trainer = new Trainer();
        trainer.atttackPokemon(new FirePokemon());
        trainer.atttackPokemon(new WaterPokemon());
        trainer.atttackPokemon(new ElectricPokemon());
    }
}