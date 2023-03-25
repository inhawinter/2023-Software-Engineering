package game.pokemon.impl;

import game.behavior.Fly;
import game.pokemon.Pokemon;
import game.weapon.Weapon;

public class Squirtle extends Pokemon {

    public Squirtle(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    public void sayHello() {
        System.out.println("꼬북 꼬북...");
    }
}
