package strategy;

public class Thunderbolt implements Weapon {
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("전기를 " + pokemon.getName() + "에게 내뿜습니다!");
    }
}
