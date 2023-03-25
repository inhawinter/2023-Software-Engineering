package game.pokemon.impl;

import game.behavior.Fly;
import game.pokemon.Pokemon;
import game.weapon.Weapon;

public class Pikachu extends Pokemon {

    public Pikachu(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    public void sayHello() {
        System.out.println("피카 피카~");
    }
}
