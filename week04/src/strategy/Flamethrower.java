package strategy;

public class Flamethrower implements Weapon {
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("화염방사를 " + pokemon.getName() + "에게 사용합니다!");
    }
}

