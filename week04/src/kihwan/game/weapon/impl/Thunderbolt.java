package game.weapon.impl;

import game.pokemon.Pokemon;
import game.weapon.Weapon;

public class Thunderbolt implements Weapon {
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("전기를 " + pokemon.getName() + "에게 내뿜습니다!");
    }
}
